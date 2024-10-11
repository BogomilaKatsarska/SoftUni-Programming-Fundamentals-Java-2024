import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class E07_AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> phrases = Arrays.asList(
                "Excellent product.",
                "Such a great product.",
                "I always use that product.",
                "Exceptional product."
        );
        List<String> events = Arrays.asList(
                "Now I feel good",
                "I feel great!",
                "Try it yourself, I am very satisfied"
        );
        List<String> authors = Arrays.asList(
                "Diyana",
                "Petya",
                "Stella"
        );
        List<String> cities = Arrays.asList(
                "Burgas",
                "Sofia",
                "Plovdiv"
        );

        int n = Integer.parseInt(scanner.nextLine());
        Random random = new Random();

        for (int i=0; i<n; i++){
            String phrase = phrases.get(random.nextInt(phrases.size()));
            String event = events.get(random.nextInt(events.size()));
            String author = authors.get(random.nextInt(authors.size()));
            String city = cities.get(random.nextInt(cities.size()));

            System.out.printf("%s %s %s - %s%n", phrase, event, author, city);
        }
    }
}
