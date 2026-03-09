package storage;

import models.Category;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CategoryStorage {

    public void saveCategories(List<Category> categories){

//        Opening the file for writing and handling exceptions
        try (FileWriter writer = new FileWriter("data/categories.txt")) {

            for(Category category : categories){

                writer.write(
                        category.getId() + "|" +
                                category.getTitle() + "|" +
                                category.getDescription() + "\n"
                );

            }

        } catch (IOException e) {
            System.out.println("Erreur lors de l'écriture dans le fichier");
            e.printStackTrace();
        }
    }
}
