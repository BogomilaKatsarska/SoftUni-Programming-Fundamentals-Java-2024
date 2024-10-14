import java.util.Scanner;

public class L09_Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "Bogomila";

        System.out.println(name.length()); // 7symbols

        name  = name + " Katsarska"; //immutable, презаписваме го
        System.out.println(name);
        name = name.replace("Bogom", "M");
        System.out.println(name);
        System.out.println(name.charAt(0));

        char[] symbols = name.toCharArray();
    }
}
