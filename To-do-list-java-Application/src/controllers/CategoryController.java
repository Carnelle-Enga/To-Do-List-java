package controllers;

import services.CategoryService;
import views.CategoryView;

public class CategoryController {
    private CategoryService categoryService;
    private CategoryView categoryView;

    public CategoryController() {
        categoryService = new CategoryService();
        categoryView = new CategoryView();
    }

    public void createCategory(){
        String title=categoryView.askCategoryTitle();
        String description=categoryView.askCategoryDescription();
        categoryService.createCategory(title,description);
    }
    public void displayCategories(){
        categoryView.displayCAtegories(categoryService.getCategories());
    }
}
