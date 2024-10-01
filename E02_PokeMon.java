import java.util.Scanner;

public class E02_PokeMon {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int pokePowerN = Integer.parseInt(scanner.nextLine());
    int targetDistanceM = Integer.parseInt(scanner.nextLine());
    int exhaustionFactorY = Integer.parseInt(scanner.nextLine());
    int startPower = pokePowerN;

    int count = 0;

    while(targetDistanceM <= pokePowerN) {
      pokePowerN -= targetDistanceM;
      count += 1;
      if (pokePowerN == startPower / 2 && exhaustionFactorY != 0){
        pokePowerN = pokePowerN / exhaustionFactorY;
      }
    }
    System.out.println(pokePowerN);
    System.out.println(count);
  }
}
