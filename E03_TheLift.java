import java.util.Arrays;
import java.util.Scanner;

public class E03_TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleWaiting = Integer.parseInt(scanner.nextLine());
        int[] lift = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        for (int i=0; i<lift.length; i++){
            while (lift[i] < 4 && peopleWaiting >0){
                lift[i] += 1;
                peopleWaiting -=1;
            }
        }
        if (peopleWaiting == 0 && lift[lift.length-1]<4){
            System.out.println("The lift has empty spots");
            for(int wagon: lift){
                System.out.print(wagon + " ");
            }
        } else if (peopleWaiting >0 && lift[lift.length-1]==4){
            System.out.printf("There is not enough space. %d people waiting", peopleWaiting);
            for(int wagon: lift){
                System.out.print(wagon + " ");
            }
        } else{
            for(int wagon: lift){
                System.out.print(wagon + " ");
            }
        }
    }
}
