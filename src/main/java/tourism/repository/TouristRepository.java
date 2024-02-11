package tourism.repository;

import org.springframework.stereotype.Repository;
import tourism.model.TouristAttraction;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TouristRepository {

    List<TouristAttraction> touristAttractions;

    public TouristRepository() {
        touristAttractions = new ArrayList<>();

        touristAttractions.add(new TouristAttraction("Kronborg Castle","An impressive Renaissance castle, famously known as Hamlet's castle. It is a UNESCO World Heritage Site, attracting visitors with its history and architecture.", "Kronborg 2 C, 3000 Helsingør"));
        touristAttractions.add(new TouristAttraction("M/S Maritime Museum of Denmark","A maritime museum showcasing Denmark's maritime history. The museum features an impressive collection of ships, models, and artifacts.", "Ny Kronborgvej 1, 3000 Helsingør"));
        touristAttractions.add(new TouristAttraction("Helsingør Cathedral (St. Olai Church)","A beautiful cathedral, also known as St. Olai Church, dating back to the 13th century. The church boasts impressive architecture and artworks.", "Sct. Anna Gade 36, 3000 Helsingør"));
        touristAttractions.add(new TouristAttraction("Kulturværftet","A cultural center by the waterfront hosting theater performances, concerts, and art exhibitions. It is a vibrant hub for culture and entertainment.", "Allegade 2, 3000 Helsingør"));
        touristAttractions.add(new TouristAttraction("Øresund Aquarium","An aquarium focusing on the marine life of the Øresund region. Visitors can explore a wide range of sea creatures and learn about the marine ecosystem.", "Strandpromenaden 5, 3000 Helsingør"));
    }


    public List<TouristAttraction> getAttractionList() {
        return touristAttractions;
    }
}
