import java.util.Scanner;

public class E01_Orders {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int countOfOrders = Integer.parseInt(scanner.nextLine());
    double totalCoffeePrice = 0.0;

    for (int i=0; i <countOfOrders; i++){
      double pricePerCapsule = Double.parseDouble(scanner.nextLine());
      int days = Integer.parseInt(scanner.nextLine());
      int capsulesCount = Integer.parseInt(scanner.nextLine());

      double orderTotalPrice = days * capsulesCount * pricePerCapsule;
      totalCoffeePrice += orderTotalPrice;

      if (countOfOrders == 1){
        System.out.printf("Total: $%.2f", orderTotalPrice);
        return;
      } else {
        System.out.printf("The price for the coffee is: $%.2f", orderTotalPrice);
      }
    }
    System.out.printf("Total: $%.2f", totalCoffeePrice);
  }
}
