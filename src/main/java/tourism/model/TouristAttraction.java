package tourism.model;

public class TouristAttraction {

    private String name;
    private String description;
    private String address;


    public TouristAttraction(String name, String description, String address) {
        this.name = name;
        this.description = description;
        this.address = address;
    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
