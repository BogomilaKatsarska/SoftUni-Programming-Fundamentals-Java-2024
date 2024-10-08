import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E05_AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<String> texts = Arrays.stream(input.split("\\|")).collect(Collectors.toList());

        Collections.reverse(texts);
        System.out.println(texts.toString()
            .replace("[", "")
            .replace("]", "")
            .replaceAll(",", "")
            .replaceAll("\\s+", " ")
            .trim());
    }
}
