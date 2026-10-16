import java.util.Scanner;

public class LibraryTest {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add a Book");
            System.out.println("2. Register a Member");
            System.out.println("3. Borrow a Book");
            System.out.println("4. Return a Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline character
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
                scanner.next(); // Clear invalid token
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();
                    
                    Book newBook = new Book(title, author, isbn, true);
                    library.addBook(newBook);
                    break;

                case 2:
                    System.out.print("Enter member name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter membership ID (integer): ");
                    
                    if (scanner.hasNextInt()) {
                        int memberId = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        Member newMember = new Member(name, memberId);
                        library.registerMember(newMember);
                    } else {
                        System.out.println("Invalid ID format. Registration cancelled.");
                        scanner.next();
                    }
                    break;

                case 3:
                    System.out.print("Enter member ID: ");
                    if (scanner.hasNextInt()) {
                        int borrowId = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        System.out.print("Enter ISBN of the book to borrow: ");
                        String borrowIsbn = scanner.nextLine();
                        library.borrowBook(borrowId, borrowIsbn);
                    } else {
                        System.out.println("Invalid ID format.");
                        scanner.next();
                    }
                    break;

                case 4:
                    System.out.print("Enter member ID: ");
                    if (scanner.hasNextInt()) {
                        int returnId = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        System.out.print("Enter ISBN of the book to return: ");
                        String returnIsbn = scanner.nextLine();
                        library.returnBook(returnId, returnIsbn);
                    } else {
                        System.out.println("Invalid ID format.");
                        scanner.next();
                    }
                    break;

                case 5:
                    System.out.println("Exiting the application. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please choose a valid option from the menu.");
            }
        } while (choice != 5);

        scanner.close();
    }
}