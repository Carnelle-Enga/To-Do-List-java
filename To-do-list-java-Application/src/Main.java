import models.Category;
import models.Task;

import java.time.LocalDate;

public class Main {
    public static void main(String[]args){
        System.out.println("hello world !");
        Category c1=new Category("menage","ycwkuwfcgwhc gcgicwuiwcskt utdgwg");
        System.out.println(c1.getId());
        Task t=new Task("faire la lessive","ctiwkwochsconqogciwhqlsnoc",c1, LocalDate.of(2026,03,25),false);
        System.out.println(t.getCategory().getTitle()+" "+t.getTitle()+" "+ t.getDescription());
        System.out.println(t.getId());

    }
}
