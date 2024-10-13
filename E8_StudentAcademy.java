import java.util.*;

public class E8_StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentsGrades = new HashMap<>();

        for(int i=1; i<=n; i++){
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            studentsGrades.putIfAbsent(name, new ArrayList<>());
            studentsGrades.get(name).add(grade);
        }

        for (Map.Entry<String, List<Double>> entry : studentsGrades.entrySet()) {
            String studentName = entry.getKey();
            List<Double> grades = entry.getValue();
            double averageGrade = getAverageGrade(grades);

            if (averageGrade >= 4.50) {
                System.out.printf("%s -> %.2f%n", studentName, averageGrade);
            }
        }
    }

    private static double getAverageGrade(List<Double> grades) {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
}
