import java.util.Scanner;

public class E09_ExtraxtFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder path = new StringBuilder(scanner.nextLine());

        StringBuilder fileName = returnFileName(path);
        StringBuilder extension = returnDot(path);

        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + extension);

    }
    public  static StringBuilder returnFileName(StringBuilder path){
        StringBuilder fileName = new StringBuilder();
        int lastIndexOfSlash = path.lastIndexOf("\\");
        int dotIndex = path.lastIndexOf(".");

        for (int i=lastIndexOfSlash+1; i< dotIndex; i++){
            fileName.append(path.charAt(i));
        }
        return fileName;
    }
    public static StringBuilder returnDot(StringBuilder path){
        StringBuilder extension = new StringBuilder();

        int dotIndex = path.lastIndexOf(".");
        for (int i=dotIndex+1; i<path.length(); i++){
            extension.append(path.charAt(i));
        }
        return extension;
    }
}
