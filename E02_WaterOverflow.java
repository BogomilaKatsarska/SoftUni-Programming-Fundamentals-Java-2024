import java.util.Scanner;

public class E02_WaterOverflow {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int tankFilled = 0;
    int inputLines = Integer.parseInt(scanner.nextLine());

    for (int i = 0; i < inputLines; i++) {
      int inputLitres = Integer.parseInt(scanner.nextLine());
      if (255 < tankFilled + inputLitres){
        System.out.println("Insufficient Capacity.");
      } else {
        tankFilled += inputLitres;
      }
    }
    System.out.println(tankFilled);
  }
}
