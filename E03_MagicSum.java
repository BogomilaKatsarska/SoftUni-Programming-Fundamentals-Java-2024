import java.util.Arrays;
import java.util.Scanner;

public class E03_MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int numberToBeEqual = Integer.parseInt(scanner.nextLine());

        for (int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                if(numbers[i] + numbers[j] == numberToBeEqual){
                    System.out.println(numbers[i] + " " + numbers[j]);
                }
            }
        }
    }
}
