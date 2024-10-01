public class L03_Demo1 {
    public static void main(String[] args) {
        int[] numbers = new int[4]; //creating empty array with 4 elements

        numbers[0] = 22;
        numbers[1] = 13;
        numbers[2] = 6;
        numbers[3] = 100;
        System.out.println(numbers.length);
        System.out.println(numbers.length - 1); // find the last index
        System.out.println(numbers[numbers.length -1]);
        System.out.printf("%d", numbers[0]);

        int sumOfFirstAndLastElement = numbers[0] + numbers[numbers.length -1];

        String[] daysOfWeek = new String[7];

        daysOfWeek[0] = "Monday";
        daysOfWeek[1] = "Tuesday"; // default value from Wed-Sat is NULL
        daysOfWeek[2] = "Wednesday";
        daysOfWeek[6] = "Sunday";

        String name = "Peter";
        char[] letters = name.toCharArray(); //.toCharArray() - creation of array from string
        System.out.println(letters[0]);
    }
}
