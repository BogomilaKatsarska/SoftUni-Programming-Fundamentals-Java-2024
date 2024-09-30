import java.util.Scanner;

public class L02_LowerOrUpper {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char input = scanner.nextLine().charAt(0);

    if ((int)input >= 65 && (int)input <= 90){
      System.out.println("upper-case");
    } else if ((int)input >= 97 && (int)input <= 122){
      System.out.println("lower-case");
    }
  }
}
