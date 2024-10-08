import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E05_BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> bombs = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> speciality = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int specialNum = speciality.get(0);
        int power = speciality.get(1);

        while(bombs.contains(specialNum)){
            int specialNumIndex = bombs.indexOf(specialNum);
            for(int i=(Math.min((bombs.size() -1),specialNumIndex+power)); i>=Math.max(0, specialNumIndex-power); i--){
                bombs.remove(i);
            }
        }
        for(int number: bombs){
            System.out.println(number);
        }

    }
}
