import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L07_Main_Students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<L07_Students> students = new ArrayList<>();

        while (!input.equals("end")) {
            String[] currentData = input.split(" ");
            String firstName = currentData[0];
            String lastName = currentData[1];
            int age = Integer.parseInt(currentData[2]);
            String hometown = currentData[3];

            L07_Students currentStudent = getExistingStudent(students, firstName, lastName);

            if (currentStudent != null) {
                currentStudent.setAge(age);
                currentStudent.setHometown(hometown);
            } else {
                currentStudent = new L07_Students(firstName, lastName, age, hometown);
                students.add(currentStudent);
            }

            L07_Students student = new L07_Students(firstName, lastName, age, hometown);
            students.add(student);

            input = scanner.nextLine();
        }
        String filterTown = scanner.nextLine();

        for (L07_Students student : students) {
            if (student.getHometown().equals(filterTown)) {
                System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }
    }

    private static L07_Students getExistingStudent(List<L07_Students> students, String firstName, String lastName) {
        for (L07_Students student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return student;
            }
        }
    return null;
    }
}
