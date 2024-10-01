import java.util.Scanner;

public class E02_SpiceMustFlow {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int startingYield = Integer.parseInt(scanner.nextLine());
    int gained = 0;
    int daysCount = 0;

    while (startingYield >= 100){
      daysCount += 1;
      gained = gained + startingYield - 26;
      startingYield -= 10;
    }
    gained -= 26;

    System.out.println(daysCount);
    System.out.println(gained);
  }
}
