import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class L05_Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> names = new ArrayList<>();
        List<String> surnames = new ArrayList<>(Arrays.asList("Katsarska", "Ivanova", "Petrova"));
//        When we have elements on different rows:
        int n = Integer.parseInt(scanner.nextLine());

        List<Integer> ages = new ArrayList<>();

        for (int i=1; i<=n; i++){
            int currentAge = Integer.parseInt(scanner.nextLine());
            ages.add(currentAge);
        }

        List<Double> salaries = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble).collect(Collectors.toList());


        names.add("Ivan");

        for(String surname: surnames){
            System.out.println(surname);
        }
    }
}
