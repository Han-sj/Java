package Class1.sub4;

public class Member {
    private String name;
    private String memberId;
    private Book borrowedBook;

    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBook = null;
    }

    public void borrowBook(Book book) {
   
        if (book.isBorrowed()) {
            System.out.println(book.getTitle() + " 이미 대출됨");
        } else {
            book.borrowBook(); 
            this.borrowedBook = book; 
            System.out.println("도서대출 : " + book.getTitle());
        }
    }

    public void returnBook(Book book) {
        if (this.borrowedBook != null && this.borrowedBook == book) {
            book.returnBook(); 
            this.borrowedBook = null; 
            System.out.println("도서반납 : " + book.getTitle());
        }
    }

    public void getMemberInfo() {
        System.out.println("회원명 : " + name);
        System.out.println("아이디 : " + memberId);
        System.out.print("대출한 도서 : ");
        if (borrowedBook != null) {
            System.out.println(borrowedBook.getTitle());
        } else {
            System.out.println("없음");
        }
    }
}