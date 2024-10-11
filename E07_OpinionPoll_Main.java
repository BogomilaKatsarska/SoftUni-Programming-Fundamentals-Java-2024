import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E07_OpinionPoll_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<E07_OpinionPoll> listOfPeople = new ArrayList<>();

        for( int i=1; i<=n; i++){
            String[] personalInfo = scanner.nextLine().split(" ");
            if (Integer.parseInt(personalInfo[1]) > 30){
                E07_OpinionPoll person = new E07_OpinionPoll(personalInfo[0], Integer.parseInt(personalInfo[1]));
                listOfPeople.add(person);
            }
        }
        for(E07_OpinionPoll person: listOfPeople){
            System.out.println(person.toString());
        }
    }
}
