import java.util.Scanner;

public class L09_Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wordToBeRemoved = scanner.nextLine();
        String wordToRemoveFrom = scanner.nextLine();

        while(wordToRemoveFrom.contains(wordToBeRemoved)){
            wordToRemoveFrom = wordToRemoveFrom.replace(wordToBeRemoved, "");
        }
        System.out.println(wordToRemoveFrom);
    }
}
