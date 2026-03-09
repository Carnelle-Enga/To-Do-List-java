package services;

import models.Category;
import storage.CategoryStorage;

import java.util.ArrayList;
import java.util.List;

public class CategoryService {
//    an arrayList to put categories inside
    private  List<Category> categories;

//create a new instance of CategoryStorage

    CategoryStorage categoryStorage=new CategoryStorage();

    public CategoryService() {
        categories = new ArrayList<Category>();
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public void createCategory(String title ,String description){
        Category category=new Category(title,description);
        categories.add(category);
        categoryStorage.saveCategories(categories);
    }
}
