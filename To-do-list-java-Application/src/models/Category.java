package models;

import utils.IdGenerator;

public class Category {
    private final int id;
    private String title;
    private String description;

    public Category( String title, String description) {
        this.id = IdGenerator.generateTaskId();
        this.title = title;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
