import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E05_HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guestsNum = Integer.parseInt(scanner.nextLine());

        List<String> listOfGuests = new ArrayList<>();

        for (int i=1; i<=guestsNum; i++){
            List<String> inputLine = Arrays.stream(scanner.nextLine().split(" "))
                    .collect(Collectors.toList());
            if (inputLine.get(2).equals("going!") && listOfGuests.contains(inputLine.get(0))){
                System.out.printf("%s is already in the list!", inputLine.get(0));
                System.out.println();
            } else if (inputLine.get(2).equals("going!") && !listOfGuests.contains(inputLine.get(0))){
                listOfGuests.add(inputLine.get(0));
            } else if (inputLine.get(2).equals("not")){
                if (listOfGuests.contains(inputLine.get(0))){
                    listOfGuests.remove(inputLine.get(0));
                } else {
                    System.out.printf("%s is not in the list!%n", inputLine.get(0));

                }
            }
        }
        for(String name: listOfGuests){
            System.out.println(name);
        }
    }
}
