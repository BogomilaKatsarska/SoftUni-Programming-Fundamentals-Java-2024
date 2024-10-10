import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class L06_MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int health = 100;
        int bitcoins = 0;

        List<String> rooms = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        int roomNum =0;

        for (String room: rooms){
            roomNum +=1;
            String command = room.split(" ")[0];
            int number = Integer.parseInt(room.split(" ")[1]);
            if (command.equals("potion")){
                health = Math.min(100, health+number);
                System.out.printf("You healed for %d hp.%n", Math.min((health-number),number));
                System.out.printf("Current health: %d hp.%n", health);
            } else if (command.equals("chest")){
                bitcoins += number;
                System.out.printf("You found %d bitcoins.%n", number);
            } else{
                health -= number;
                if (health >number){
                    System.out.printf("You slayed %s monster.%n", command);
                } else {
                    System.out.printf("You died!Killed by %s monster.%n", command);
                    System.out.printf("Best room: %d%n", roomNum);
                    return;
                }
            }
        }
        System.out.printf("You've made it!");
        System.out.printf("Bitcoins: %d%n", bitcoins);
        System.out.printf("Health: %d", health);
    }
}
