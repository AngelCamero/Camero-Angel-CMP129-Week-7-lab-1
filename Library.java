import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Member> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added book: " + book.getTitle());
    }

    public void registerMember(Member member) {
        members.add(member);
        System.out.println("Registered member: " + member.getName());
    }

    public Book findBookByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    public Member findMemberById(int membershipID) {
        for (Member member : members) {
            if (member.getMembershipID() == membershipID) {
                return member;
            }
        }
        return null;
    }

    public void borrowBook(int membershipID, String isbn) {
        Member member = findMemberById(membershipID);
        Book book = findBookByIsbn(isbn);

        if (member == null) {
            System.out.println("Error: Member with ID " + membershipID + " not found.");
            return;
        }
        if (book == null) {
            System.out.println("Error: Book with ISBN " + isbn + " not found.");
            return;
        }
        if (!book.isAvailable()) {
            System.out.println("Error: Book '" + book.getTitle() + "' is currently checked out.");
            return;
        }

        book.setAvailable(false);
        member.borrowBook(book);
        System.out.println("Success: " + member.getName() + " successfully borrowed '" + book.getTitle() + "'.");
    }

    public void returnBook(int membershipID, String isbn) {
        Member member = findMemberById(membershipID);
        Book book = findBookByIsbn(isbn);

        if (member == null) {
            System.out.println("Error: Member with ID " + membershipID + " not found.");
            return;
        }
        if (book == null) {
            System.out.println("Error: Book with ISBN " + isbn + " not found.");
            return;
        }
        if (!member.getBorrowedBooks().contains(book)) {
            System.out.println("Error: Member " + member.getName() + " did not borrow this book.");
            return;
        }

        book.setAvailable(true);
        member.returnBook(book);
        System.out.println("Success: " + member.getName() + " successfully returned '" + book.getTitle() + "'.");
    }

    public void displayBook(Book book) {
        book.displayInfo();
    }

    public void displayMember(Member member) {
        member.displayMember();
    }
}