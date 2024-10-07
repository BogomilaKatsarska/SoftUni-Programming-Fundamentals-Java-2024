import java.util.Scanner;

public class E04_SmallestOfThreeNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        printLargestNumber(firstNum, secondNum, thirdNum);

    }

    public static void printLargestNumber(int n1, int n2, int n3){
        int smallerBetweenFirstAndSecond = Math.min(n1, n2);
        System.out.println(Math.min(smallerBetweenFirstAndSecond, n3));
    }
}
