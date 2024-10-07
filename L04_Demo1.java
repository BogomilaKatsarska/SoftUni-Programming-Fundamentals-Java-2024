public class L04_Demo1 {
    public static void main(String[] args) {
        printNumbersFromOneToThree();

        printNumbersFrom50To100();

        printNumbersFromOneToThree();

        printNumbersFrom50To100();
    }
    public static void printNumbersFromOneToThree(){
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
    }

    public static void printNumbersFrom50To100() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }

}
