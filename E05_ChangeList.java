import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E05_ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listOfIntegers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).
                collect(Collectors.toList());

        List<String> command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        while (!command.get(0).equals("end")){
            if (command.get(0).equals("Delete")){
                int elementToBeDeleted = Integer.parseInt(command.get(1));
                for(int i=0; i<listOfIntegers.size(); i++){
                    if (listOfIntegers.get(i).equals(elementToBeDeleted)) {
                        listOfIntegers.remove(Integer.valueOf(elementToBeDeleted));
                        i--;
                    }
                }
            } else if (command.get(0).equals("Insert")){
                int elementToBeInserted = Integer.parseInt(command.get(1));
                int positionToBeInserted = Integer.parseInt(command.get(2));
                listOfIntegers.add(positionToBeInserted, elementToBeInserted);
            }
            command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        }
        for(int element: listOfIntegers){
            System.out.print(element+" ");
        }

    }
}
