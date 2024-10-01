import java.util.Scanner;

public class E02_SumDigits {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int input = Integer.parseInt(scanner.nextLine());

    int sumOfDigits = 0;

    while (input > 0){
      sumOfDigits += input % 10;
      input = input / 10;
    }
    System.out.println(sumOfDigits);
  }
}
