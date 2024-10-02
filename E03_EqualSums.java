import java.util.Arrays;
import java.util.Scanner;

public class E03_EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        if (array.length == 1){
            System.out.println("0");
            return;
        }

        for (int i=0; i<=array.length; i++){
            int leftSum = 0;
            int rightSum = 0;

            for (int leftI = 0; leftI<i; leftI++){
                leftSum += array[leftI];
            }
            for (int rightI = i+1; rightI<=array.length-1; rightI++){
                rightSum += array[rightI];
            }
            if (leftSum == rightSum) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("No");
    }
}
