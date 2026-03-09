package views;

import models.Category;

import java.util.List;
import java.util.Scanner;

public class CategoryView {
        private Scanner scanner = new Scanner(System.in);


    public void displayCAtegories(List<Category> categories){
        System.out.println("-------------------------------------------------Liste des categories----------------------------------");

        System.out.println(".|     Numero   "+".|     titre   ."+".|     Description   .|");
        for(Category category : categories){
            System.out.println(category.getId()+" | "+category.getTitle()+" | "+category.getDescription());
        }

    }

    public String askCategoryTitle(){

        System.out.print("Entrez le titre de la Category : ");
        return scanner.nextLine();
    }
    public String askCategoryDescription(){

        System.out.print("Entrez la description  de la Categorie : ");
        return scanner.nextLine();
    }


}
