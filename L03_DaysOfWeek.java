import java.util.Scanner;

public class L03_DaysOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int day = Integer.parseInt(scanner.nextLine());

        String[] weekdays = new String[7];

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        weekdays[0] = "Monday";
        weekdays[1] = "Tuesday";
        weekdays[2] = "Wednesday";
        weekdays[3] = "Thursday";
        weekdays[4] = "Friday";
        weekdays[5] = "Saturday";
        weekdays[6] = "Sunday";

        if (day >= 1 && day <=7){
            System.out.printf("%s", weekdays[day -1]);
        } else {
            System.out.println("Invalid day!");
        }

    }
}
