import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class E07_OrderByAge_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] command = scanner.nextLine().split(" ");
        List<E07_OrderByAge> people = new ArrayList<>();

        while (!command[0].equals("End")){
            String name = command[0];
            int id = Integer.parseInt(command[1]);
            int age = Integer.parseInt(command[2]);

            E07_OrderByAge person = new E07_OrderByAge(name, id, age);
            people.add(person);

            command = scanner.nextLine().split(" ");
        }

        people.sort(Comparator.comparingInt(E07_OrderByAge::getAge));

        for(E07_OrderByAge person: people){
            System.out.println(person.toString());
        }
    }
}
