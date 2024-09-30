import java.util.Scanner;

public class L02_PoundsToDollars {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double gbp = Double.parseDouble(scanner.nextLine());
    double gbpToUsd = gbp * 1.36;
    System.out.printf("%.3f", gbpToUsd);
  }
}
