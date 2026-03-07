package models;

public class Category {
    private static int count =0;
    private  final int id;
    private String title;
    private String description;

    public Category(String title, String description){
        this.id=count;
        count++;
        this.title = title;
        this.description = description;
    }


    public static int getCount() {
        return count;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }
}
