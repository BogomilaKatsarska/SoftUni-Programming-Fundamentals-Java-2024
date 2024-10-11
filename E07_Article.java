public class E07_Article {
    private String title;
    private String content;
    private String author;

    public E07_Article(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void editContent(String content){
        this.content = content;
    };

    public void editAuthor(String author){
        this.author = author;
    };

    public void editTitle(String title){
        this.title = title;
    }

    @Override
    public String toString() {
        return title + " - " + content + ": " + author;
    }
}
