package Class1.sub4;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isBorrowed;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = false;
    }

    public void borrowBook() {
        if (!isBorrowed) {
            isBorrowed = true;
        }
    }

    public void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
        }
    }

    public void getBookInfo() {
        System.out.println("도서명 : " + title);
        System.out.println("저자 : " + author);
        System.out.println("ISBN : " + isbn);
        System.out.println("대출여부 : " + (isBorrowed ? "불가능" : "가능"));
    }

    public String getTitle() {
        return title;
    }


    public boolean isBorrowed() {
        return isBorrowed;
    }
}