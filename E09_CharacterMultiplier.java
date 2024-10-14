import java.util.Scanner;

public class E09_CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");
        int totalSum = 0;

        if (words[0].length() == words[1].length()){
            for (int i=0; i<words[0].length(); i++){
                int currMultiplication = words[0].charAt(i) * words[1].charAt(i);
                totalSum += currMultiplication;
            }
        } if (words[0].length() > words[1].length()){
            int remainderOfIndexes = words[0].length() - words[1].length();
            for (int i=0; i<words[1].length(); i++){
                int currMultiplication = words[0].charAt(i) * words[1].charAt(i);
                totalSum += currMultiplication;
            }
            for (int i=words[1].length(); i<=words[1].length()+remainderOfIndexes-1; i++){
                String currWord = words[0];
                totalSum += currWord.charAt(i);
            }
        } else if (words[1].length() > words[0].length()){
            int remainderOfIndexes = words[1].length() - words[0].length();
            for (int i=0; i<words[0].length(); i++){
                int currMultiplication = words[0].charAt(i) * words[1].charAt(i);
                totalSum += currMultiplication;
            }
            for (int i=words[0].length(); i<=words[0].length()+remainderOfIndexes-1; i++){
                String currWord = words[1];
                totalSum += currWord.charAt(i);
            }
        }
        System.out.println(totalSum);
    }
}
