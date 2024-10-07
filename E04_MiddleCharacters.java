import java.util.Scanner;

public class E04_MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        findMiddleChar(text);
    }
    public static void findMiddleChar(String text){
        int length = text.length();
        if (length % 2 != 0){
            int middleSymbol = length/2;
            System.out.println(text.charAt(middleSymbol));
        } else {
            char firstMiddle = text.charAt((length/2)-1);
            char secondMiddle = text.charAt(length/2);
            System.out.printf("%c%c", firstMiddle, secondMiddle);
        }
    }
}
