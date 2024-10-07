import java.util.Scanner;

public class E04_VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().toLowerCase();
        System.out.println(getVowelsCount(text));
    }

    public static int getVowelsCount(String text){
        int count = 0;
        for(char symbol: text.toCharArray()){
            if (symbol == 'a' || symbol == 'e' || symbol == 'o' || symbol == 'i' || symbol == 'u'){
                count ++;
            }
        }
        return count;
    }
}
