import java.util.Scanner;

public class E04_PrintAndSum {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int firstNumber = Integer.parseInt(scanner.nextLine());
    int secondNumber = Integer.parseInt(scanner.nextLine());
    int totalSum = 0;

    for (int i = firstNumber; i <= secondNumber; i++){
      totalSum += i;
      System.out.print(i);
    }
    System.out.printf("Total Sum: %d", totalSum);
  }
}
