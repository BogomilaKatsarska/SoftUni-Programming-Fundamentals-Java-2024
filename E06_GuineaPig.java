import java.util.Scanner;

public class E06_GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double quantityOfFood = Double.parseDouble(scanner.nextLine());
        double quantityOfHay = Double.parseDouble(scanner.nextLine());
        double quantityOfCover = Double.parseDouble(scanner.nextLine());
        double pigWeight = Double.parseDouble(scanner.nextLine());

        for(int day=1; day<=30; day++) {
            quantityOfFood -= 0.3;
            if (quantityOfFood <= 0) {
                System.out.println("Go shopping!");
                return;
            }
            if (day % 2 == 0) {
                quantityOfHay -= 0.05 * quantityOfFood;
                if (quantityOfHay <= 0) {
                    System.out.println("Go shopping!");
                    return;
                }
            }
                if (day % 3 == 0) {
                    quantityOfCover -= pigWeight / 3;
                    if (quantityOfCover <= 0) {
                        System.out.println("Go shopping!");
                        return;
                    }
                }
            }
        System.out.printf("Food: %.2f, Hay: %.2f, Cover: %.2f", quantityOfFood, quantityOfHay, quantityOfCover);
    }
}
