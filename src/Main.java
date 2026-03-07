import models.Category;
import models.Task;

import java.time.LocalDate;

public class Main {

    public static void main(String [] args){
        Category c1 =new Category("menage","toute tache qui concerne les traveaux menagers");
        Category c2 =new Category("ecole","toute tache qui concerne les cours");

        System.out.println(c1.getId()+" "+c1.getTitle()+" "+ c1.getDescription());

        Task t= new Task("laver les assietes","faire le grand menage des assietes ", LocalDate.of(2026, 3, 20),false,c1.getId());
        System.out.println(t.getId()+" "+t.getTitle()+" "+ t.getDescription());
    }

}
