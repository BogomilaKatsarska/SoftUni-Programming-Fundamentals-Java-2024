import java.util.Scanner;

public class E03_CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArr = scanner.nextLine().split(" ");
        String[] secondArr = scanner.nextLine().split(" ");

        for (String element1: firstArr){
            for (String element2: secondArr){
                if (element1.equals(element2)){
                    System.out.print(element1+" ");
                }
            }
        }
    }
}
