import java.util.Scanner;

public class E03_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] array = new int[n];
        int sum = 0;

        for(int i=0; i<n; i++){
            array[i] = Integer.parseInt(scanner.nextLine());
            sum += array[i];
        }
        for (int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
