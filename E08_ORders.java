import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class E08_ORders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] command = scanner.nextLine().split(" ");

        Map<String, Double> productPrice = new TreeMap<>();
        Map<String, Integer> productQuantity = new TreeMap<>();

        while(!command[0].equals("buy")){
            if (!productPrice.containsKey(command[0])){
                productPrice.put(command[0], Double.parseDouble(command[1]));
                productQuantity.put(command[0], Integer.parseInt(command[2]));
            } else {
                if (productPrice.get(command[0])==(Double.parseDouble(command[1]))){
                    int oldProductQuantity = productQuantity.get(command[0]);
                    productQuantity.put(command[0], oldProductQuantity+Integer.parseInt(command[2]));
                } else {
                    productPrice.put(command[0], Double.parseDouble(command[1]));
                    int oldProductQuantity = productQuantity.get(command[0]);
                    productQuantity.put(command[0], oldProductQuantity+Integer.parseInt(command[2]));
                }
            }

            command = scanner.nextLine().split(" ");
        }

        Map<String, Double> finalResult = new TreeMap<>();

        for (Map.Entry<String, Double> entry: productPrice.entrySet()){
            finalResult.put(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<String, Integer> entry: productQuantity.entrySet()){
            double oldRes = finalResult.get(entry.getKey());
            finalResult.put(entry.getKey(), oldRes*entry.getValue());
        }

        for (Map.Entry<String, Double> entry: finalResult.entrySet()){
            System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue());
        }
    }
}
