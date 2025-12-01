import java.util.List;
import java.util.ArrayList;
public class Student extends Person {
    private List<Book> borrowedBooks;
    public Student(String name,String email) {
        super(name,email);

        this.borrowedBooks = new ArrayList<>();

    }
    public Student(){
        super("Studend xyz","student@iut-dhaka.edu");
        this.borrowedBooks = new ArrayList<>();
    }
    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }
    public void addBook(Book book){
        this.borrowedBooks.add(book);
    }

    @Override
    void DisplayDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Books Borrowed: " + borrowedBooks.size() + " Books ");
        for (Book book : borrowedBooks) {
            System.out.println("Book no: " + borrowedBooks.indexOf(book)+1);
            book.DisplayInfo();
        }
    }

}
