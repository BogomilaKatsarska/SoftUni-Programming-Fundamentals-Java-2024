public class L04_Demo {
    public static void main(String[] args) {
        printHeaderPart();

        printMiddlePart("Java", 200);

        printFooterPart();
    }

    public static void printHeaderPart(){
        System.out.println("SoftUni EOOD, Alexander Malinov 78");
    }

    public static void printFooterPart(){
        System.out.println("05-June-2025");
    }

    public static void printMiddlePart(String courseName, double price){
        System.out.println(courseName);
        System.out.println(price);
    }
}
