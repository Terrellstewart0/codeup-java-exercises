package movies;

public class movie {

    private String name;
    private String catagory;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }

    public movie(String name, String catagory) {
        this.name = name;
        this.catagory = catagory;

    }
}
