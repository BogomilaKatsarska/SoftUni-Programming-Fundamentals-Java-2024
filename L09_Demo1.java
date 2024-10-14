import java.util.Scanner;

public class L09_Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(); //empty StringBuilder
        sb.append("Hello, ");
        sb.append("Bogomila");
        System.out.println(sb);
        sb.delete(6, sb.length());
        System.out.println(sb);
        System.out.println(sb.reverse());
    }
}
