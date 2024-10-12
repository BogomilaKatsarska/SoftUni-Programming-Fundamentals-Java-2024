import java.util.*;

public class L08_CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        Map<Integer, Integer> realNums = new TreeMap<>();
        for(int number: numbers){
            if (!realNums.containsKey(number)){
                realNums.put(number, 1);
            } else {
                int oldRealNumValue = realNums.get(number);
                realNums.put(number, oldRealNumValue+1);
            }
        }

        for (Map.Entry<Integer, Integer> entry: realNums.entrySet()){
            System.out.printf("%d -> %d %n", entry.getKey(), entry.getValue());
        }
    }

}