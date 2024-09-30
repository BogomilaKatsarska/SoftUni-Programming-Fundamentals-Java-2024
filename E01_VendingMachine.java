import java.util.Scanner;

public class E01_VendingMachine {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String command = scanner.nextLine();
    double insertedMoney = 0.0;

    while (!command.equals("Start")){
      if (command.equals("0.1") || command.equals("0.2") || command.equals("0.5") || command.equals("1") || command.equals("2")){
        insertedMoney += Double.parseDouble(command);
      } else {
        System.out.printf("Cannot accept %.2f", Double.parseDouble(command));
      }
      command = scanner.nextLine();
    }

    String foodCommand = scanner.nextLine();

    while (!foodCommand.equals("End")){
      if (foodCommand.equals("Nuts")){
        if (insertedMoney >= 2.0){
          insertedMoney -= 2.0;
          System.out.println("Purchased Nuts.");
        } else {
          System.out.println("Sorry, not enough money.");
        }
      } else if (foodCommand.equals("Water")){
        if (insertedMoney >= 0.7){
          insertedMoney -= 0.7;
          System.out.println("Purchased Water.");
        } else {
          System.out.println("Sorry, not enough money.");
        }
      } else if (foodCommand.equals("Crisps")){
        if (insertedMoney >= 1.5){
          insertedMoney -= 1.5;
          System.out.println("Purchased Crisps.");
        } else {
          System.out.println("Sorry, not enough money.");
        }
      } else if (foodCommand.equals("Soda")){
        if (insertedMoney >= 0.8){
          insertedMoney -= 0.8;
          System.out.println("Purchased Soda.");
        } else {
          System.out.println("Sorry, not enough money.");
        }
      } else if (foodCommand.equals("Coke")) {
        if (insertedMoney >= 1.0){
          insertedMoney -= 1.0;
          System.out.println("Purchased Coke.");
        } else {
          System.out.println("Sorry, not enough money.");
        }
      } else {
        System.out.println("Invalid product.");
      }
      foodCommand = scanner.nextLine();
    }
    System.out.printf("Change: %.2f", insertedMoney);
  }
}
