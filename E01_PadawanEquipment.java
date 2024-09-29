import java.util.Scanner;

public class E01_PadawanEquipment {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double budget = Double.parseDouble(scanner.nextLine());
    int countStudents = Integer.parseInt(scanner.nextLine());
    double priceSaber = Double.parseDouble(scanner.nextLine());
    double priceRobe = Double.parseDouble(scanner.nextLine());
    double priceBelt = Double.parseDouble(scanner.nextLine());

    double countSaber = Math.ceil(countStudents * 1.1);
    int countRobes = countStudents;
    int countBelts = countStudents - countStudents / 6;

    double totalSum = (priceBelt * countBelts) + (priceSaber * countSaber) + (priceRobe * countRobes);

    if (budget  >= totalSum) {
      System.out.printf("The money is enough - it would cost %.2fl.v.", totalSum);
    } else {
      double neededMoney = totalSum - budget;
      System.out.printf("George Lucas will need %.2flv more.", neededMoney);
    }
  }
}
