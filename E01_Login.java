import java.util.Scanner;

public class E01_Login {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String username = scanner.nextLine();
    String password = "";

    for (int i = username.length() - 1; i <= 0; i--){
        char symbol = username.charAt(i);
        password += symbol;
    }

    String enteredPassword = scanner.nextLine();
    int countWrongAttempts = 0;

    while (!enteredPassword.equals(password)) {
      countWrongAttempts++;
      if (countWrongAttempts == 4){
        System.out.println("User blocked!");
        return; // return stops the entire program, while break stops only the loop
      }
      System.out.println("Incorrect password. Try again.");
      enteredPassword = scanner.nextLine();
    }
    System.out.printf("User %s logged in.", username);
  }
}
