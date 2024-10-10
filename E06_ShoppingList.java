import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E06_ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> groceries = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());
        List<String> command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        while (!command.get(0).equals("Go") && !command.get(1).equals("Shopping!")) {
            String action = command.get(0);
            String item1 = command.get(1);
            if (action.equals("Urgent")) {
                if (!groceries.contains(item1)) {
                    groceries.add(0, item1);
                }
            } else if (action.equals("Unnecessary")) {
                if (groceries.contains(item1)) {
                    groceries.remove(item1);
                }
            } else if (action.equals("Correct")) {
                String item2 = command.get(2);
                if (groceries.contains(item1)) {
                    int indexOfItem2 = groceries.indexOf(item1);
                    groceries.set(indexOfItem2, item2);
                }
            } else if (action.equals("Rearrange")) {
                if (groceries.contains(item1)) {
                    groceries.remove(item1);
                    groceries.add(item1);
                }
            }
            command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        }
        for (int i = 0; i <= groceries.size() - 1; i++) {
            if (i == groceries.size() - 1) {
                System.out.print(groceries.get(i));
                break;
            } else {
                System.out.print(groceries.get(i) + ", ");
            }
        }
    }
}
