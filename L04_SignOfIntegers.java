import java.util.Scanner;

public class L04_SignOfIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        findSignOfNum(input);

    }

    public static void findSignOfNum(int number){
        if (number < 0){
            System.out.println("Negative");
        } else if (number > 0){
            System.out.println("Positive");
        } else {
            System.out.println("0");
        }
    }
}
