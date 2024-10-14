import java.util.Scanner;

public class L10_WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder route = new StringBuilder(scanner.nextLine());
        String[] command = scanner.nextLine().split(":");

        while ((!command[0].equals("Travel"))) {
            if (command[0].equals("Add Stop")) {
                int givenIndex = Integer.parseInt(command[1]);
                String destination = command[2];
                route.insert(givenIndex, destination);
            } else if (command[0].equals("Remove Stop")) {
                int startIndex = Integer.parseInt(command[1]);
                int endIndex = Integer.parseInt(command[2]);
                if (startIndex >= 0 && startIndex < route.length() && endIndex >= startIndex && endIndex <= route.length()) {
                    route.delete(startIndex, endIndex+1);
                }
            } else if (command[0].equals("Switch")) {
                String oldDestination = command[1];
                String newDestination = command[2];

                //Hawai::Rome-Greece
                int firstIndex = route.indexOf(oldDestination);//индекс 0
                int lastIndex = firstIndex + oldDestination.length();//индекс 5
                //int lastIndex = worldTour.lastIndexOf(oldDestination);

                //проверяваме дали дестинацията, която искаме да заменим съществува
                if (route.toString().contains(oldDestination)) {
                    //заменяме съществуващата дестинация с новата
                    route.replace(firstIndex, lastIndex, newDestination);
                }
            }
            System.out.println(route);

            command = scanner.nextLine().split(":");

        }
        System.out.println(route);
    }
}