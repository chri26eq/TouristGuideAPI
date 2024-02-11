package tourism.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import tourism.model.TouristAttraction;
import tourism.repository.TouristRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class TouristService {


    TouristRepository touristRepository;

    public TouristService() {
        touristRepository = new TouristRepository();
    }


    public List<TouristAttraction> getTouristAttractionList() {
        return touristRepository.getAttractionList();
    }

    public TouristAttraction deleteTouristAttraction(String name) {
        for (TouristAttraction attraction : touristRepository.getAttractionList()) {
            if (attraction.getName().trim().equalsIgnoreCase(name.trim())) {
                TouristAttraction deletedAttraction = new TouristAttraction(attraction.getName(),attraction.getDescription(),attraction.getAddress()); //Copy attraction before deletion
                touristRepository.getAttractionList().remove(attraction); //attraction is deleted
                return deletedAttraction;
            }
        }
        return null;
    }


}
