import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E09_ValidUsername {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        List<String> validWords = new ArrayList<>();

        boolean isValid = true;

        for(String word: input){
            if (word.length() <= 3 || word.length() >=16){
                continue;
            }

            for (int i=0; i< word.length(); i++){
                char currChar = word.charAt(i);
                if ((currChar >= 48 && currChar <= 57)||(currChar >= 65 && currChar <= 90) ||(currChar >= 97 && currChar <= 122) || currChar == 95 || currChar == 45){
                    isValid = true;
                } else {
                    isValid = false;
                    break;
                }
                if (i== word.length()-1){
                    validWords.add(word);
                }
            }
        }
        for(String word: validWords){
            System.out.println(word);
        }

    }
}
