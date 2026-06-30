import java.util.*;

class Book {
    int id;
    String name;
    boolean issued;

    Book(int id, String name) {
        this.id = id;
        this.name = name;
        this.issued = false;
    }
}

public class LibraryManagement {
    static ArrayList<Book> books = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void addBook() {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Book Name: ");
        String name = sc.nextLine();

        books.add(new Book(id, name));
        System.out.println("Book Added Successfully!");
    }

    public static void showBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        for (Book b : books) {
            System.out.println("ID: " + b.id + " | Name: " + b.name + 
            " | Status: " + (b.issued ? "Issued" : "Available"));
        }
    }

    public static void issueBook() {
        System.out.print("Enter Book ID to issue: ");
        int id = sc.nextInt();

        for (Book b : books) {
            if (b.id == id) {
                if (!b.issued) {
                    b.issued = true;
                    System.out.println("Book Issued!");
                } else {
                    System.out.println("Book already issued.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public static void returnBook() {
        System.out.print("Enter Book ID to return: ");
        int id = sc.nextInt();

        for (Book b : books) {
            if (b.id == id) {
                if (b.issued) {
                    b.issued = false;
                    System.out.println("Book Returned!");
                } else {
                    System.out.println("This book was not issued.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n--- Library Management System ---");
            System.out.println("1. Add Book");
            System.out.println("2. Show Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1: addBook(); break;
                case 2: showBooks(); break;
                case 3: issueBook(); break;
                case 4: returnBook(); break;
                case 5: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid Choice!");
            }
        } while (choice != 5);
    }
}