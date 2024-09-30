import java.util.Scanner;

public class E03_Vacation {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int numberOfPeople = Integer.parseInt(scanner.nextLine());
    String typeOfPeople = scanner.nextLine();
    String dayOfWeek = scanner.nextLine();

    double signlePrice = 0.0;

    if (dayOfWeek.equals("Friday")) {
      if (typeOfPeople.equals("Students")) {
        signlePrice = 8.45;
      } else if (typeOfPeople.equals("Business")) {
        signlePrice = 10.90;
      } else if (typeOfPeople.equals("Regular")) {
        signlePrice = 15.0;
      }
    } else if (dayOfWeek.equals("Saturday")) {
      if (typeOfPeople.equals("Students")) {
        signlePrice = 9.80;
      } else if (typeOfPeople.equals("Business")) {
        signlePrice = 15.60;
      } else if (typeOfPeople.equals("Regular")) {
        signlePrice = 20.0;
        }
      } else if (dayOfWeek.equals("Sunday")) {
        if (typeOfPeople.equals("Students")) {
          signlePrice = 10.46;
        } else if (typeOfPeople.equals("Business")) {
          signlePrice = 16.0;
        } else if (typeOfPeople.equals("Regular")) {
          signlePrice = 22.50;
        }
      }
    double totalPrice = 0.0;
    if (numberOfPeople >= 30 && typeOfPeople.equals("Students")){
      totalPrice = (signlePrice * numberOfPeople) * 0.85;
    } else if (numberOfPeople < 30 && typeOfPeople.equals("Students")){
      totalPrice = signlePrice * numberOfPeople;
    } else if (numberOfPeople >= 100 && typeOfPeople.equals("Business")){
      totalPrice = (numberOfPeople - 10) * signlePrice;
    } else if (numberOfPeople < 100 && typeOfPeople.equals("Business")){
      totalPrice = numberOfPeople * signlePrice;
    } else if (numberOfPeople >= 10 && numberOfPeople <= 20 && typeOfPeople.equals("Regular")){
      totalPrice = (numberOfPeople + signlePrice) * 0.95;
    } else if ((numberOfPeople < 10 || numberOfPeople > 20) && typeOfPeople.equals("Regular")){
      totalPrice = numberOfPeople * signlePrice;
    }
    System.out.printf("Total price: %.2f", totalPrice);
    }
  }
