import java.util.Scanner;

public class E02_Elevator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int numOfPeople = Integer.parseInt(scanner.nextLine());
    int capacity = Integer.parseInt(scanner.nextLine());

    int totalCourses = 0;

    if (numOfPeople % capacity == 0) {
      totalCourses = numOfPeople / capacity;
    } else {
      totalCourses = (numOfPeople / capacity) + 1;
    }
    System.out.println(totalCourses);
  }
}
