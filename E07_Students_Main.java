import java.util.*;

public class E07_Students_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<E07_Students> allStudents = new ArrayList<>();

        for(int i=1; i<=n; i++){
            String[] input = scanner.nextLine().split(" ");
            String firstName = input[0];
            String lastName = input[1];
            double grade = Double.parseDouble(input[2]);

            E07_Students student = new E07_Students(firstName, lastName, grade);
            allStudents.add(student);

        }

        //comparing list of students according to their grade:
        allStudents.sort(Comparator.comparingDouble(E07_Students::getGrade).reversed());

        for(E07_Students student: allStudents){
            System.out.printf("%s %s %.2f%n", student.getFirstName(), student.getLastName(), student.getGrade());
        }

    }
}
