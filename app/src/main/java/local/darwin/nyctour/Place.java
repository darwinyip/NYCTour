package local.darwin.nyctour;

/**
 * Model for Places used to hold data.
 */
class Place {
    private String name;
    private String location;
    private String description;
    private int imageResourceId;

    Place(String name, String location, String description, int imageResourceId) {
        this.name = name;
        this.location = location;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    String getLocation() {
        return location;
    }

    String getDescription() {
        return description;
    }

    int getImageResourceId() {
        return imageResourceId;
    }

    @Override
    public String toString() {
        return "Place{" +
                "name='" + name + '\'' +
                "location='" + location + '\'' +
                ", description='" + description + '\'' +
                ", imageResourceId=" + imageResourceId +
                '}';
    }
}
