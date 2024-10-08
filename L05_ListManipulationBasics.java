import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class L05_ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> myOutputList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<String> command = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        while (!command.get(0).equals("end")){
            if (command.get(0).equals("Add")){
                myOutputList.add(Integer.parseInt(command.get(1)));
            } else if (command.get(0).equals("Remove")){
                myOutputList.remove(Integer.valueOf(Integer.parseInt(command.get(1))));
            } else if (command.get(0).equals("RemoveAt")){
                myOutputList.remove(Integer.parseInt(command.get(1)));
            } else if (command.get(0).equals("Insert")){
                myOutputList.add(Integer.parseInt(command.get(2)), Integer.parseInt(command.get(1)));
            }
            command = Arrays.stream(scanner.nextLine().split(" "))
                    .collect(Collectors.toList());
        }
        System.out.println(myOutputList);

    }
}
