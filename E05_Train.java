import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E05_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());

        List<String> command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        while (!command.get(0).equals("end")){
            if (command.get(0).equals("Add")){
                wagons.add(Integer.parseInt(command.get(1)));
            } else{
                int passengersCount = Integer.parseInt(command.get(0));
                for(int i=0; i<wagons.size(); i++){
                    int currWagon = wagons.get(i);
                    if (currWagon+passengersCount <= maxCapacity){
                        int newCurrWagonCount = currWagon+passengersCount;
                        wagons.set(i, newCurrWagonCount);
                        break;
                    }
                }
            }
            command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        }
        for(int wagon: wagons){
            System.out.print(wagon+" ");
        }
    }
}
