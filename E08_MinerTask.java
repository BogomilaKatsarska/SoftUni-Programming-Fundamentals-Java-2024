import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class E08_MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> resources = new HashMap<>();

        String command1 = scanner.nextLine();

        while (!command1.equals("stop")){
            int command2 = Integer.parseInt(scanner.nextLine());
            if (resources.containsKey(command1)){
                int oldValue = resources.get(command1);
                resources.put(command1, oldValue+command2);
            } else {
                resources.put(command1, command2);
            }

            command1 = scanner.nextLine();
        }

        for(Map.Entry<String, Integer> entry: resources.entrySet()){
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
