import java.util.Scanner;

public class L09_DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder listOfDigits = new StringBuilder();
        StringBuilder listOfLetters = new StringBuilder();
        StringBuilder listOfChars = new StringBuilder();

        String input = scanner.nextLine();

        for(int i=0; i<input.length(); i++){
            char currChar = input.charAt(i);

            if (Character.isDigit(currChar)){
                listOfDigits.append(currChar);
            } else if (Character.isAlphabetic(currChar)){
                listOfLetters.append(currChar);
            } else {
                listOfChars.append(currChar);
            }
        }

        System.out.println(listOfDigits);
        System.out.println(listOfLetters);
        System.out.println(listOfChars);
    }
}
