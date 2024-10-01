import java.util.Scanner;

public class E02_SumOfChars {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int numberOfLines = Integer.parseInt(scanner.nextLine());
    int totalSum = 0;

    for (int i = 0; i < numberOfLines; i++) {
      char letter = scanner.nextLine().charAt(0);
      totalSum += letter;
    }
    System.out.println(totalSum);
  }
}
