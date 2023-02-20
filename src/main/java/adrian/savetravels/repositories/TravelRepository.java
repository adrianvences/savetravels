package adrian.savetravels.repositories;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import adrian.savetravels.models.Travel;

@Repository
public interface TravelRepository extends CrudRepository <Travel,Long> {
  List<Travel> findAll();
  
}



