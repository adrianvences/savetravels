package adrian.savetravels.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import adrian.savetravels.models.Travel;
import adrian.savetravels.services.TravelService;

@Controller
public class MainController {

  @Autowired TravelService travelService;

  // create / read all
  @RequestMapping("/")
  public String index(@ModelAttribute("travel") Travel travel, Model model){
    List<Travel> travels = travelService.getAllBurgers();
    System.out.println(travels);
    model.addAttribute("travels", travels);
    return "index.jsp";
  }

  @PostMapping("/travels")
  public String create(@Valid @ModelAttribute("travel") Travel travel, BindingResult result){
    if(result.hasErrors()){
      System.out.println("we are here");
      return "index.jsp";
    } else {
      travelService.createTravel(travel);
    }

    return "redirect:/";
  }


      // update

      @GetMapping("/travels/edit/{id}")
      public String edit(@PathVariable("id")Long id,Model model){
        Travel travel = travelService.getOneTravel(id); // pass it in to getOneBook
        model.addAttribute("travel", travel);
        return "edit.jsp";
      }
    
      @PutMapping("/travels/{id}")
      public String update(@Valid @ModelAttribute("travel")Travel travel,BindingResult result) {
        if(result.hasErrors()){
          return "edit.jsp";
        } else {
          travelService.updateTravel(travel);
        return "redirect:/";
        }
      }


            //delete
  @DeleteMapping("/travels/{id}")
  public String deleteTravel(@PathVariable("id") Long id) {
    Travel travel = travelService.getOneTravel(id);
    travelService.deleteTravel(travel);
    return "redirect:/";
  }

    // // read one //Model is the object we are importing// model is name of variable // like request.form from python // like a box where we put stuff
    @GetMapping("/travels/{id}") //passing id in path
    public String show(@PathVariable("id")Long id,Model model){ //taking it use pathvariable 
      Travel travel = travelService.getOneTravel(id); // pass it in to getOneTravel
      model.addAttribute("travel", travel);
      return "show.jsp";
    }

}
