import java.util.*;

public class E08_CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" -> ");
        Map<String, List<String>> listOfEmployees = new HashMap<>();

        while (!input[0].equals("End")){
            String company = input[0];
            String employeeId = input[1];

            listOfEmployees.putIfAbsent(company, new ArrayList<>());
            List<String> value = listOfEmployees.get(company);
            value.add(employeeId);

            input = scanner.nextLine().split(" -> ");
        }

        for (Map.Entry<String, List<String>> entry: listOfEmployees.entrySet()){
            System.out.printf("%s %n",entry.getKey());
            for (String element: entry.getValue()){
                System.out.printf("-- %s%n", element);
            }
        }
    }
}
