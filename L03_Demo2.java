import java.util.Arrays;
import java.util.Scanner;

public class L03_Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        for (int num : numbers){ //for each
//            System.out.println(num);
//        }
//
//        int[] array = new int[n];
//
//        for (int position = 0; position < array.length; position++){
//            array[position] = Integer.parseInt(scanner.nextLine());
//        }

//        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
//                .mapToInt(Integer::parseInt)
//                .toArray();
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        String[] collection = scanner.nextLine().split(" ");

        Arrays.stream(collection).forEach(e -> System.out.println(e));

    }
}
