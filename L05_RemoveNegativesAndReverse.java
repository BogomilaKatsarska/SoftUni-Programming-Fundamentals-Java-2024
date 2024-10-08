import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class L05_RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        for (int i=0; i<numbers.size(); i++){
            int currentNum = numbers.get(i);
            if (currentNum < 0){
                numbers.remove(Integer.valueOf(currentNum));
                i--;
            }
        }
        Collections.sort(numbers, Collections.reverseOrder());

        if (numbers.isEmpty()){
            System.out.println("empty");
        } else {
            for (int number : numbers) {
                System.out.print(number + " ");
            }
        }
    }
}
