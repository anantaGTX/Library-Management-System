import java.util.ArrayList;
import java.util.List;

public class Library {
    private static int totalBooksIssued = 0;
    public void issueBook(Book book,Person person) {
        List<Book>bookList = person.getBorrowedBooks();
        bookList.add(book);
        totalBooksIssued++;
        System.out.println(" Book " + book.getTitle() + " Issued to " + person.getName() + "." );

    }
    public void printDetails(Person person) {
        System.out.println("----Printing Details----");
        person.DisplayDetails();

    }
    public static int getTotalBooksIssued() {
        return totalBooksIssued;
    }
}
