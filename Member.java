import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;
    private int membershipID;
    private List<Book> borrowedBooks;

    public Member(String name, int membershipID) {
        this.name = name;
        this.membershipID = membershipID;
        this.borrowedBooks = new ArrayList<>();
    }

   
    public String getName() { 
        return name; 
    }
    public int getMembershipID() { 
        return membershipID; 
    }
    public List<Book> getBorrowedBooks() { 
        return borrowedBooks; 
    }

  
    public void setName(String name) { 
        this.name = name; 
    }
    public void setMembershipID(int membershipID) { 
        this.membershipID = membershipID; 
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    public void displayMember() {
        System.out.println("Member Name: " + name + ", ID: " + membershipID + ", Borrowed Books Count: " + borrowedBooks.size());
    }
}