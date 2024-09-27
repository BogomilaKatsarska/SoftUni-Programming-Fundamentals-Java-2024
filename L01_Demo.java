import java.util.Scanner;

public class L01_Demo {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    String name = scanner.nextLine();
    int number = Integer.parseInt(scanner.nextLine());
    double grade = Double.parseDouble(scanner.nextLine());
    char symbol = '@';
    boolean isTrue = true;

    System.out.println(name);

//    %s - string
//    %d - int
//    %f - double
//    %c - char
//    %n \n - new line
    System.out.printf("%f", grade);
  }
}
