import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library1 = new Library();
        System.out.println("Starting Library Management System");
        System.out.println("-----------------------------------\n");
        System.out.println("--- Enter Student Details ---");
        System.out.println("Enter Student Name: ");
        String s1 = new Scanner(System.in).next();
        System.out.println("Enter Student Email: ");
        String s2 = new Scanner(System.in).next();
        Student student = new Student(s1,s2);

        System.out.println("\n--- Enter Faculty Details ---");
        System.out.println("Enter Faculty Name: ");
        String s3 = new Scanner(System.in).next();
        System.out.println("Enter Faculty Email: ");
        String s4 = new Scanner(System.in).next();
        Faculty faculty = new Faculty(s3,s4);

        System.out.println("\n--- Enter Book Details ---");
        System.out.println("Enter Book Title: ");
        String s5 = new Scanner(System.in).next();
        System.out.println("Enter Book Author: ");
        String s6 = new Scanner(System.in).next();
        System.out.println("Enter ISBN: ");
        String s7 = new Scanner(System.in).next();
        System.out.println("Enter Price: ");
        double price = new Scanner(System.in).nextDouble();

        Book bookA = new Book(s5,s6,s7, (float) price) ;

        System.out.println("\n--- Enter Book ");





        Student s1 = new Student("Asif Abrar","asifabrar28@iut-dhaka.edu");
        Faculty f1 = new Faculty("Rafid Haque","rafidhaque@iut-dhaka.edu");
        Book bookA = new Book("OOP with Java", "B. Child", "111-222-333", 35.2F);
        Book bookB = new Book("Data Structures", "A. Algo", "444-555-666", 50.00F);
        Book bookC = new Book("Networking Basics", "C. Net", "777-888-999", 25.00F);
        library.issueBook(bookA,s1);
        library.issueBook(bookB,s1);
        library.issueBook(bookC,f1);
        library.printDetails(s1);
        library.printDetails(f1);
        System.out.println("\n=====================================");
        System.out.println("TOTAL BOOKS ISSUED IN LIBRARY SYSTEM: " + Library.getTotalBooksIssued());
        System.out.println("=====================================");

    }
}