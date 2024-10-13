import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class E08_LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> obtainedMaterials = new HashMap<>();

        boolean itemObtained = false;

        while (!itemObtained) {
            String[] input = scanner.nextLine().split(" ");
            for (int i = 0; i < input.length-1; i += 2) {
                int countEl = Integer.parseInt(input[i]);
                String el = input[i + 1].toLowerCase();

                if (obtainedMaterials.containsKey(el)) {
                    int oldElValue = obtainedMaterials.get(el);
                    int newElValue = oldElValue + countEl;
                    obtainedMaterials.replace(el, newElValue);
                }

                obtainedMaterials.putIfAbsent(el, countEl);

            }
            itemObtained = checkIfObtained(obtainedMaterials);
        }
        for(Map.Entry<String, Integer> entry: obtainedMaterials.entrySet()){
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }

    }

    private static boolean checkIfObtained(Map<String, Integer> listToCheck) {
        for (Map.Entry<String, Integer> entry : listToCheck.entrySet()) {
            if (entry.getKey().equals("shards") && entry.getValue() >= 250) {
                System.out.println("Shadowmourne obtained");
                listToCheck.put(entry.getKey(), entry.getValue()-250);

                return true;
            } else if (entry.getKey().equals("fragments") && entry.getValue() >= 250) {
                System.out.println("Valanyr obtained");
                listToCheck.put(entry.getKey(), entry.getValue()-250);
                return true;
            } else if (entry.getKey().equals("motes") && entry.getValue() >= 250) {
                listToCheck.put(entry.getKey(), entry.getValue()-250);
                System.out.println("Dragonwrath obtained");
                return true;
            }
        }
        return false;
    }
}