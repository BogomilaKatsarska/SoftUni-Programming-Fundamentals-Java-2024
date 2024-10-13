import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class E08_SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> parkingLot = new HashMap<>();

        for(int i=1; i<=n; i++){
            String[] input = scanner.nextLine().split(" ");
            String command = input[0];
            String username = input[1];

            if (command.equals("register")){
                String plateNum = input[2];
                if (parkingLot.containsKey(username)){
                    System.out.printf("ERROR: already registered with %s plate number%n", plateNum);
                } else {
                    parkingLot.put(username, plateNum);
                    System.out.printf("%s registered successfully %s plate numberZ%n",username, plateNum);
                }
            } else if (command.equals("unregister")){
                if (!parkingLot.containsKey(username)){
                    System.out.printf("ERROR: username %s not found%n", username);
                } else {
                    parkingLot.remove(username);
                    System.out.printf("%s unregistered successfully%n", username);
                }
            }
        }

        for (Map.Entry<String, String> entry: parkingLot.entrySet()){
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
        }

    }
}
