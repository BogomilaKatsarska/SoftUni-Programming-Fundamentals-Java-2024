import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class L08_Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.HashMap - ordering of elements does not matter
        //2.LinkedHashMap - ordering depends on when added
        //3.TreeMap - ordered by key
        Map<String, Double> students = new HashMap<>();
        System.out.println(students.size());

        students.put("Ivan", 5.50);
        students.put("Stoyan", 3.80);
        students.put("Georgi", 4.10);
        //check if our map contains specific element:
        System.out.println(students.containsKey("Stoyan"));
        System.out.println(students.containsValue(5.50));


        students.put("Ivan", 5.80); // change the previous value of Ivan - 5.50.
        System.out.println(students.size());
        students.remove("Ivan");
        System.out.println(students.isEmpty());

        students.putIfAbsent("Milonich", 5.50);

        students.replace("Ivan", 5.90); // replace the value for a given key

        students.clear();
    }

}
