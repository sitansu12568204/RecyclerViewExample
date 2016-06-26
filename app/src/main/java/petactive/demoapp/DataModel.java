package petactive.demoapp;

/**
 * Created by Barsa on 6/26/2016.
 */
public class DataModel {

    public DataModel(String imageUrl, String name)
    {
        this.imageUrl = imageUrl;
        this.name = name;

    }

    private String imageUrl;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }



}
