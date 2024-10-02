import java.util.Arrays;
import java.util.Scanner;

public class E03_ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int rotations = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= rotations-1; i++) {
            int zeroIndexInitial = array[0];
            for (int index=0; index<=array.length-2; index++){
                array[index] = array[index+1];
            }
            array[array.length-1] = zeroIndexInitial;
        }
        for(int element: array){
            System.out.print(element + " ");
        }
    }
}
