package tourism.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tourism.model.TouristAttraction;
import tourism.service.TouristService;

import java.util.List;

@Controller
@RequestMapping("attractions/")
public class TouristController {
    private final TouristService touristService;
    public TouristController(TouristService touristService) {
         this.touristService = touristService;
    }


    @GetMapping("")
    public ResponseEntity<List<TouristAttraction>> getAttractions() {
        List<TouristAttraction> touristAttractions = touristService.getTouristAttractionList();
        return new ResponseEntity<>(touristAttractions,HttpStatus.OK);
    }
    @GetMapping("{name}")
    public ResponseEntity<TouristAttraction> getAttraction(@PathVariable String name) {
        for (TouristAttraction attraction : touristService.getTouristAttractionList()) {
            if (attraction.getName().trim().equalsIgnoreCase(name.trim())) {
                return new ResponseEntity<>(attraction,HttpStatus.OK);
            }
        }
         return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }

    @PostMapping("add")
    public ResponseEntity<TouristAttraction> addAttraction() {

       return new ResponseEntity<>(null, HttpStatus.CREATED);
    }

    @PostMapping("update")
    public ResponseEntity<TouristAttraction> updateAttraction() {

        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @GetMapping("delete/{name}")
    public ResponseEntity<TouristAttraction> deleteAttraction(@PathVariable String name) {
        TouristAttraction deletedAttraction = touristService.deleteTouristAttraction(name);
        if (deletedAttraction == null) return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        else return new ResponseEntity<>(deletedAttraction,HttpStatus.OK);
    }

}
