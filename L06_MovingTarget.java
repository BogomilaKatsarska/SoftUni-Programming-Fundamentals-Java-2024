import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.zip.InflaterInputStream;

public class L06_MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targets = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<String> command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        while (!command.get(0).equals("End")){
            String action = command.get(0);
            int index = Integer.parseInt(command.get(1));
            if (action.equals("Shoot")){
                int power = Integer.parseInt(command.get(2));
                if (index >= 0 && index < targets.size()){
                    if (power < targets.get(index)){
                        targets.set(index, (targets.get(index)-power));
                    } else {
                        targets.remove(index);
                    }
                }
            } else if (action.equals("Add")){
                int value = Integer.parseInt(command.get(2));
                if (index >= 0 && index < targets.size()){
                    targets.add(index, value);
                } else {
                    System.out.println("Invalid placement!");
                }
            } else if (action.equals("Strike")){
                int radius = Integer.parseInt(command.get(2));
                if (index-radius <0 || index+radius>targets.size()-1){
                    System.out.println("Strike missed");
                } else {
                    for(int i=index+radius; i>=index-radius; i--){
                        targets.remove(i);
                    }
                }
            }
            command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        }
        for(int i=0; i<=targets.size()-1; i++){
            if (i == targets.size()-1){
            System.out.print(targets.get(i));
            break;
            } else {
                System.out.print(targets.get(i) + "|");
            }
        }
    }
}
