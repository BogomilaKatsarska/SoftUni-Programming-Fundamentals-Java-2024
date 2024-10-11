import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E07_Vehicles_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] command = scanner.nextLine().split(" ");
        List<E07_Vehicles> vehicles= new ArrayList<>();

        while(!command[0].equals("End")){
            String type = command[0];
            String model = command[1];
            String color = command[2];
            int horsepower = Integer.parseInt(command[3]);

            E07_Vehicles vehicle = new E07_Vehicles(type, model, color, horsepower);
            vehicles.add(vehicle);

            command = scanner.nextLine().split(" ");
        }
        String closeCmd = scanner.nextLine();

        while (!closeCmd.equals("Close the Catalogue!")){
            for (E07_Vehicles vehicle: vehicles){
                if (vehicle.getModel().contains(closeCmd)){
                    System.out.println(vehicle.toString());
                }
            }
            closeCmd = scanner.nextLine();
        }

        int totalHpCars = 0;
        int carsCount = 0;
        int totalHpTrucks = 0;
        int trucksCount = 0;

        for (E07_Vehicles vehicle: vehicles){
            if (vehicle.getType().equals("car")){
                totalHpCars += vehicle.getHorsepower();
                carsCount += 1;
            } else {
                totalHpTrucks += vehicle.getHorsepower();
                trucksCount += 1;
            }
        }
        double carsAvgHp = 0.0;
        double trucksAvgHp = 0.0;

        if (carsCount != 0) {
            carsAvgHp = totalHpCars * 1.0 / carsCount;
        } else {
            carsAvgHp = 0;
        }
        if (trucksCount != 0){
            trucksAvgHp = totalHpTrucks * 1.0 / trucksCount;
        } else {
            trucksAvgHp = 0;
        }

        System.out.printf("Cars have average of %.2f HP", carsAvgHp);
        System.out.printf("Trucks have average of %.2f HP", trucksAvgHp);
    }
}
