import java.util.Scanner;

public class L01_TimeAfter30Minutes {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int hours = Integer.parseInt(scanner.nextLine());
    int minutes = Integer.parseInt(scanner.nextLine());

    int totalMinutesPlus30Minutes = hours*60 + minutes + 30;
    int final_hours = totalMinutesPlus30Minutes / 60;
    int final_minutes = totalMinutesPlus30Minutes % 60;

    if (final_hours > 23){
      final_hours = 0;
    }

    System.out.printf("%d:%02d", final_hours, final_minutes);
  }
}
