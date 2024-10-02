import java.util.Arrays;
import java.util.Scanner;

public class E03_TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        for (int position = 0; position<=array.length-1; position++){
            if (position == array.length -1){
                System.out.println(array[position]);
                break;
            }

            int currentNumber = array[position];
            boolean isTop = true;

            for (int nextPosition = position + 1; nextPosition<=array.length-1; nextPosition++){
                if (currentNumber <= array[nextPosition]){
                    isTop = false;
                    break;
                }
            }
            if (isTop){
                System.out.println(currentNumber);
            }
        }

    }
}
