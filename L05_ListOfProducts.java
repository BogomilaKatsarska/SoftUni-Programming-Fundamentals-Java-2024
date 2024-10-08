import java.util.*;

public class L05_ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        List<String> products = new ArrayList<>();

        for(int n=1; n<=number; n++){
            String input = scanner.nextLine();
            products.add(input);
        }
        int counter = 1;
        Collections.sort(products);
        for(String product: products){
            System.out.printf("%d. %s", counter, product);
            System.out.println();
            counter++;
        }
    }
}
