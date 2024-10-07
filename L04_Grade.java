import java.util.Scanner;

public class L04_Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        printGradeInWords(grade);
    }

    private static void printGradeInWords(double currentGrade) {

        if(currentGrade >= 2 && currentGrade <= 2.99){
            System.out.println("Fail");
        } else if (currentGrade >= 3 && currentGrade <= 3.49) {
            System.out.println("Poor");
        } else if (currentGrade >= 3.50 && currentGrade <= 4.49) {
            System.out.println("Good");
        } else if (currentGrade >= 4.50 && currentGrade <= 5.49) {
            System.out.println("Very good");
        } else if (currentGrade >= 5.50 && currentGrade <= 6) {
            System.out.println("Excellent");
        }
    }
}