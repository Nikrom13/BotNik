public class Item {
    private String title;
    private String rare;
    private String description;


    public Item(String title, String description, String rare) {
        this.title = title;
        this.rare = rare;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRare() {
        return rare;
    }

    public void setRare(String rare) {
        this.rare = rare;
    }
}
