import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E07_GroomingSalon_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        E07_Salon salon = new E07_Salon(20);
        E07_Pet dog = new E07_Pet("Ellias", 5, "Tim");
        salon.add(dog);

        System.out.println(salon.remove("Ellias"));
        System.out.println(salon.remove("Pufa"));

        E07_Pet cat = new E07_Pet("Bella", 2, "Mia");
        E07_Pet bunny = new E07_Pet("Zak", 4, "Jon");

        salon.add(cat);
        salon.add(bunny);

        E07_Pet pet = salon.getPet("Bella", "Mia");
        System.out.println(pet);

        System.out.println(salon.getStatistics());
    }

}
