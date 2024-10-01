import java.util.Scanner;

public class E02_BeerKegs {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int countOfKegs = Integer.parseInt(scanner.nextLine());
    double biggestKegVolume = 0;
    String biggestKegName = "";

    for (int i = 0; i < countOfKegs; i++) {
      String kegName = scanner.nextLine();
      double kegRadius = Double.parseDouble(scanner.nextLine());
      int kegHeight = Integer.parseInt(scanner.nextLine());

      double kegVolume = Math.PI * kegRadius * kegRadius * kegHeight;

      if (kegVolume > biggestKegVolume){
        biggestKegVolume = kegVolume;
        biggestKegName = kegName;
      }
    }
    System.out.println(biggestKegName);
  }
}
