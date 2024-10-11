import java.util.Scanner;

public class L07_Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        L07_Car car1 = new L07_Car("Skoda", 190, "Black");
        System.out.println(car1.getBrand());
        car1.setColor("Green");
        car1.startEngine();
    }
}
