package adrian.savetravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import adrian.savetravels.models.Travel;
import adrian.savetravels.repositories.TravelRepository;

@Service
public class TravelService {

  @Autowired TravelRepository travelRepository; // dep injection
  
  //read all
  public List<Travel> getAllBurgers(){
    return travelRepository.findAll();
    
  }

    //create
    public void createTravel( Travel travel) {
      travelRepository.save(travel);
    }

       //update

  public void updateTravel(Travel travel) {
    travelRepository.save(travel);
  }

    //read one 
    public Travel getOneTravel(Long id) {
      Optional<Travel> optionalTravel = travelRepository.findById(id); // optional if we get it we get it and if it messes up we get null
      return optionalTravel.orElse(null);
  }


   //delete
   public void deleteTravel(Travel travel){ // a long is a type of int that is bigger
    travelRepository.delete(travel);
  }


}
