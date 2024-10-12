import java.util.*;

public class L08_WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> words = new HashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i=1; i<=n; i++){
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            words.putIfAbsent(word, new ArrayList<>());
//            List<String> currentSynonyms = words.get(word);
//            currentSynonyms.add(word);
//            words.put(word, currentSynonyms);

            words.get(word).add(synonym); // we take the list of values for key 'word' and add the synonym.
        }

        for(Map.Entry<String, List<String>> entry: words.entrySet()){
            String currentWord = entry.getKey();
            List<String> synonymsForCurrentWord = entry.getValue();
            System.out.printf("%s - %s%n", currentWord, String.join(", ", synonymsForCurrentWord));
        }
    }
}
