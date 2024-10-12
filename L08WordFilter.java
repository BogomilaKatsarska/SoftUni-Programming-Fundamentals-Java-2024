import java.util.Arrays;
import java.util.Scanner;

public class L08WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] oddLengthStrings = Arrays.stream(scanner.nextLine().split(" "))
                .filter(e -> e.length() % 2 == 0)
                .toArray(String[]::new);

//        for(String word: oddLengthStrings){
//            System.out.println(word);
//        }
        Arrays.stream(oddLengthStrings).forEach(e -> System.out.println(e));
    }
}
