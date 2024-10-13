import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class E08_CountCharsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        Map<Character, Integer> lettersCountMap = new HashMap<>();

        int countOfWords = words.length;
        String word = words[0];

        for (char symbol: word.toCharArray()){

            if (lettersCountMap.containsKey(symbol)){
                int currValue = lettersCountMap.get(symbol);
                lettersCountMap.replace(symbol, currValue+countOfWords);
            }
            lettersCountMap.putIfAbsent(symbol, countOfWords);

        }
        for (Map.Entry<Character, Integer> entry: lettersCountMap.entrySet()){
            System.out.printf("%c -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
