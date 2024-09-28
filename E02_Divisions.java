import java.util.Scanner;

public class E02_Divisions {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int number = Integer.parseInt(scanner.nextLine());
    String result = "";

    if (number % 10 == 0){
      result = "The number is divisible by 10.";
    } else if (number % 7 == 0){
      result = "The number is divisible by 7.";
    } else if (number % 6 == 0) {
      result = "The number is divisible by 6.";
    } else if (number % 3 == 0) {
      result = "The number is divisible by 3.";
    } else if (number % 2 == 0) {
      result = "The number is divisible by 2.";
    } else {
      result = "Not divisible.";
    }
    System.out.println(result);
  }
}
