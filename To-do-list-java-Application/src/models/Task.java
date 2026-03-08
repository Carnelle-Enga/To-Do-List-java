package models;

import java.time.LocalDate;

public class Task {

    private static int count =0 ;
    private final int id;
    private String title;
    private String description;
    private int categoryId;
    private LocalDate dueDate;
    private boolean completed;

    public Task( String title, String description, int categoryId, LocalDate dueDate, boolean completed) {
        this.id = getCount();
        count++;
        this.title = title;
        this.description = description;
        this.categoryId = categoryId;
        this.dueDate = dueDate;
        this.completed = completed;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Task.count = count;
    }

    public int getId() {
        return id;
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

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
