import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E06_Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> items = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        List<String> command = Arrays.stream(scanner.nextLine().split(" - ")).collect(Collectors.toList());

        String action = command.get(0);
        while(!action.equals("Craft!")){
            if (action.equals("Collect")){
                String item = command.get(1);
                if (!items.contains(item)){
                    items.add(item);
                }
            } else if(action.equals("Drop")){
                String item = command.get(1);
                if (items.contains(item)){
                    items.remove(item);
                }
            } else if(action.equals("Combine Items")){
                List<String> bothItems = Arrays.stream(command.get(1).split(":")).collect(Collectors.toList());
                String oldItem = bothItems.get(0);
                String newItem = bothItems.get(1);
                if (items.contains(oldItem)){
                    int positionOldItem = items.indexOf(oldItem);
                    int positionNewItem = positionOldItem + 1;
                    items.add(positionNewItem, newItem);
                }

            } else if(action.equals("Renew")){
                String item = command.get(1);
                if (items.contains(item)){
                    items.remove(item);
                    items.add(item);
                }
            }
            command = Arrays.stream(scanner.nextLine().split(" - ")).collect(Collectors.toList());
            action = command.get(0);
        }
        System.out.println(items.toString().
                replace("[", "")
            .replace("]", ""));
    }
}
