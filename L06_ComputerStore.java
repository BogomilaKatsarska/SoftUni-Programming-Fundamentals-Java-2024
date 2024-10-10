import java.util.Scanner;

public class L06_ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        double priceWithoutVAT = 0.0;

        while (!command.equals("special") && !command.equals("regular")){
            if (Double.parseDouble(command) <= 0.0){
                System.out.println("Invalid price");
                command = scanner.nextLine();
                continue;
            }
            priceWithoutVAT += Double.parseDouble(command);

            command = scanner.nextLine();
        }

        double regularPriceWithVAT = 1.2 * priceWithoutVAT;
        if (command.equals("special")){
            regularPriceWithVAT = regularPriceWithVAT * 0.9;
        }

        double amountOfTaxes = 0.0;
        if (regularPriceWithVAT == 0.0){
            System.out.println("Invalid order");
        } else {
            System.out.println("Congratulations you've just bought a new computer!");
            if (command.equals("special")) {
                amountOfTaxes = (regularPriceWithVAT * 10/9) - priceWithoutVAT ;
            } else {
                amountOfTaxes = regularPriceWithVAT - priceWithoutVAT;
            }
            System.out.printf("Price without taxes: %.2f$%n", priceWithoutVAT);
            System.out.printf("Taxes: %.2f$%n", amountOfTaxes);
            System.out.println("---------------------------------");
            System.out.printf("Total price: %.2f", regularPriceWithVAT);
        }
    }
}
