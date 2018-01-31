package local.darwin.nyctour;

/**
 * Model for Places used to hold data.
 */
public class Place {
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

    public void setName(String mName) {
        this.name = mName;
    }

    String getLocation() {
        return location;
    }

    public void setLocation(String mLocation) {
        this.location = mLocation;
    }

    String getDescription() {
        return description;
    }

    public void setDescription(String mDescription) {
        this.description = mDescription;
    }

    int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int mImageResourceId) {
        this.imageResourceId = mImageResourceId;
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
