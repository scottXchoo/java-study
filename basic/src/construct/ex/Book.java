package construct.ex;

public class Book {
    String title;
    String author;
    int page;

    Book() {
        this("", "");
    }

    Book(String title, String author) {
        this(title, author, 20);
    }

    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    // TODO 코드 완성
    void displayInfo() {
        System.out.println("Display Info: " + this.title + ", " + this.author + ", " + this.page);
    }
}
