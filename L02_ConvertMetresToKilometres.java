import java.util.Scanner;

public class L02_ConvertMetresToKilometres {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int metres = Integer.parseInt(scanner.nextLine());

    double metresToKilometres = metres / 1000.0;
    System.out.printf("%.2f", metresToKilometres);
  }
}
