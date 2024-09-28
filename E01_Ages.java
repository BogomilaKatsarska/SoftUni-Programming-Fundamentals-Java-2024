import java.util.Scanner;

public class E01_Ages {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int age = Integer.parseInt(scanner.nextLine());
    String ageCategory = "";

    if (age >= 0 && age <= 2){
      ageCategory = "baby";
    } else if (age >=3 && age <= 13){
      ageCategory = "child";
    } else if (age >= 14 && age <= 19){
      ageCategory = "teenager";
    } else if (age >=20 && age <= 65) {
      ageCategory = "adult";
    } else if (age >= 66){
      ageCategory = "elder";
    }

    System.out.printf("%s", ageCategory);
  }
}
