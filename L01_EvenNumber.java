import java.util.Scanner;

public class L01_EvenNumber {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int number = Math.abs(Integer.parseInt(scanner.nextLine()));

    while (number % 2 == 1) {
      System.out.println("Please write even number.");
      number = Math.abs(Integer.parseInt(scanner.nextLine()));
    }

    System.out.println(Math.abs(number));
  }
}
