import java.util.Scanner;

public class L01_SumOfOddNumbers {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int number = Integer.parseInt(scanner.nextLine());
    int currentNumber = 1;
    int sum = 0;

    for (int i = 1; i <= number; i++){
      System.out.println(currentNumber);
      sum += currentNumber;
      currentNumber += 2;
    }
    System.out.printf("Sum: %d", sum);
  }
}
