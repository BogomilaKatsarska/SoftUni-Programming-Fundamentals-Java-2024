import java.util.Arrays;
import java.util.Scanner;

public class E03_ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        String command = scanner.nextLine();

        while (!command.equals("end")){
            String[] commandToArr = command.split(" ");
            if (commandToArr[0].equals("swap")){
                int index1 = Integer.parseInt(commandToArr[1]);
                int index2 = Integer.parseInt(commandToArr[2]);
                int temp = numbers[index1];
                numbers[index1] = numbers[index2];
                numbers[index2] = temp;
            } else if ( commandToArr[0].equals("decrease")){
                for (int i=0; i<numbers.length; i++){
                    numbers[i] -=1;
                }
            } else if (commandToArr[0].equals("multiply")){
                int index1 = Integer.parseInt(commandToArr[1]);
                int index2 = Integer.parseInt(commandToArr[2]);
                numbers[index1] = numbers[index1] * numbers[index2];
            }
            command = scanner.nextLine();
        }
        for(int num: numbers){
            System.out.print(num+ " ");
        }
    }
}
