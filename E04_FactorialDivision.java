import java.util.Scanner;

public class E04_FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        long factorialFirstNumber = findFactorial(firstNumber);
        long factorialSecondNumber = findFactorial(secondNumber);
        double result = factorialFirstNumber / (factorialSecondNumber*1.0);
        System.out.printf("%.2f", result);
    }

    public static long findFactorial(int n){
        long fact = 1;
        for (int i=1; i<=n; i++){
            fact *=i;
        }
        return fact;
    }
}
