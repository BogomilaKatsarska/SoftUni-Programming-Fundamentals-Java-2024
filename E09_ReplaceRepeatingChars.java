import java.util.Scanner;

public class E09_ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder string = new StringBuilder(scanner.nextLine());
        for (int i=0; i<string.length()-1; i++){
            if (string.charAt(i) == string.charAt(i+1)){
                string.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(string);
    }
}
