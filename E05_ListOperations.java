import org.omg.PortableInterceptor.INACTIVE;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E05_ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listOfNums = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<String> command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        while(!command.get(0).equals("End")) {
            if (command.get(0).equals("Add")) {
                listOfNums.add(Integer.parseInt(command.get(1)));
            } else if (command.get(0).equals("Insert")) {
                if (Integer.parseInt(command.get(2)) >= listOfNums.size()) {
                    System.out.println("Invalid index");
                } else {
                    int numberToBeInserted = Integer.parseInt(command.get(1));
                    int indexToBeInserted = Integer.parseInt(command.get(2));
                    listOfNums.add(indexToBeInserted, numberToBeInserted);
                }
            } else if (command.get(0).equals("Remove")) {
                if (Integer.parseInt(command.get(1)) >= listOfNums.size()) {
                    System.out.println("Invalid index");
                } else {
                    int indexToBeRemoved = Integer.parseInt(command.get(1));
                    listOfNums.remove(indexToBeRemoved);
                }
            } else if (command.get(1).equals("left")) {
                int count = Integer.parseInt(command.get(2));
                for (int i = 1; i <= count; i++) {
                    int firstNumber = listOfNums.get(0);
                    listOfNums.remove(0);
                    listOfNums.add(firstNumber);
                }
            } else if (command.get(1).equals("right")) {
                int count = Integer.parseInt(command.get(2));
                for (int i = 1; i <= count; i++) {
                    int lastNumber = listOfNums.get(listOfNums.size() - 1);
                    listOfNums.remove(listOfNums.size() - 1);
                    listOfNums.add(0, lastNumber);
                }
            }
            command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        }
        for(int number: listOfNums){
            System.out.print(number+ " ");
        }
    }
}
