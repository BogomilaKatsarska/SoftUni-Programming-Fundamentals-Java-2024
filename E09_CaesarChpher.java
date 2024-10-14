import java.util.Scanner;

public class E09_CaesarChpher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder input = new StringBuilder(scanner.nextLine());

        for (int i = 0; i<input.length(); i++){
            char charToBeSet = input.charAt(i);
            charToBeSet += 3;
            input.setCharAt(i, charToBeSet);
        }
        System.out.println(input);
    }
}
