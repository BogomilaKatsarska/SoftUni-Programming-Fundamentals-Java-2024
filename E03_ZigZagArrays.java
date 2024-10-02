import java.util.Arrays;
import java.util.Scanner;

public class E03_ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int[] firstArr = new int[number];
        int[] secondArr = new int[number];

        for(int i=1; i<=number; i++){
            int[] input = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(e -> Integer.parseInt(e))
                    .toArray();
            if (i%2 != 0){
                firstArr[i-1] = input[0];
                secondArr[i-1] = input[1];
            } else {
                firstArr[i-1] = input[1];
                secondArr[i-1] = input[0];
            }
        }
        for(int element: firstArr){
            System.out.print(element + " ");
        }
        System.out.println();
        for (int element: secondArr){
            System.out.print(element + " ");
        }
    }
}
