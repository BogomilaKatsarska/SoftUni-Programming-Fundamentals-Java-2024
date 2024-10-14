import java.util.Scanner;

public class L09_ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        while (!line.equals("end")){
            String reversedLine = "";
            for (int i=(line.length()-1); i>=0; i--){
                reversedLine = reversedLine + line.charAt(i);
            }
            System.out.printf("%s = %s", line, reversedLine);
            line = scanner.nextLine();
        }
    }
}
