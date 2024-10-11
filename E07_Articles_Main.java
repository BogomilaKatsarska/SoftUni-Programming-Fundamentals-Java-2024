import java.util.Scanner;

public class E07_Articles_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] article = scanner.nextLine().split(", ");

        E07_Article myArticle = new E07_Article(article[0], article[1], article[2]);
        int number = Integer.parseInt(scanner.nextLine());

        for (int i=0; i<number; i++){
            String[] command = scanner.nextLine().split(": ");
            String action = command[0];
            if (action.equals("Edit")){
                String newContent = command[1];
                myArticle.editContent(newContent);
            } else if (action.equals("ChangeAuthor")){
                String newAuthor = command[1];
                myArticle.editAuthor(newAuthor);
            } else if (action.equals("Rename")){
                String newTitle = command[1];
                myArticle.editTitle(newTitle);
            }
        }

        System.out.println(myArticle.toString());
    }
}
