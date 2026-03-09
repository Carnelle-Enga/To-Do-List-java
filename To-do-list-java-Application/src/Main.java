import controllers.CategoryController;
import models.Category;
import models.Task;

import java.time.LocalDate;

public class Main {
    public static void main(String[]args){
        System.out.println("hello world !");
        CategoryController categoryController=new CategoryController();
        categoryController.createCategory();
        categoryController.displayCategories();
    }
}
