import java.util.Scanner;

public class L09_RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arrayOfStr = scanner.nextLine().split(" ");
        int repetitions = Integer.parseInt(scanner.nextLine());
        String joinedWord = "";
        String result = "";

        for(String word: arrayOfStr){
            joinedWord += word;
        }

        for(int i=1; i<repetitions; i++){
            result += joinedWord;
        }
        System.out.println(result);
    }
}
