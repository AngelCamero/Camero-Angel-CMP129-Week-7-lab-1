CMP 129 – Computer Science II
Week 7 – Lab 1: Library Management System
Learning Objectives

After completing this lab, students should be able to:

Design a UML class diagram.
Identify attributes, methods, and relationships between classes.
Implement multiple related Java classes.
Apply encapsulation using private attributes and public methods.
Use constructors, getters, and setters.
Store objects in an ArrayList.
Implement borrowing and returning functionality.
Test an object-oriented program using a separate test class.
Assignment Overview

Design and implement a simple library management system containing these classes:

Book
Member
Library
LibraryTest

Your submission must include:

A UML class diagram.
Four Java source files.
A brief design and testing report.
Your completed AI-use report.
Part 1: UML Class Diagram

Create a clear UML class diagram showing:

Class names
Private attributes
Public constructors
Getter and setter methods
Other required methods
Relationships between the classes
Appropriate multiplicities

Your diagram should represent the following design:

Students may create the diagram using Word, PowerPoint, diagrams.net, Lucidchart, or another UML diagramming program.

Save the diagram as:

Library-UML-Diagram.pdf
Part 2: Book Class

Create:

Book.java

The Book class must contain these private attributes:

private String title;
private String author;
private String isbn;
private boolean available;
Constructor

Create a constructor that receives the title, author, and ISBN:

public Book(String title, String author, String isbn)

A newly created book must be available by default.

Required Methods

Include getter and setter methods for every attribute.

Also create:

public void displayInfo()

This method must display the book’s title, author, ISBN, and availability.

Part 3: Member Class

Create:

Member.java

The Member class must contain:

private String name;
private String membershipId;
private ArrayList<Book> borrowedBooks;
Constructor
public Member(String name, String membershipId)

The constructor must initialize an empty ArrayList<Book> for the member’s borrowed books.

Required Methods

Include getters and setters for name and membershipId, along with a getter for borrowedBooks.

Create:

public boolean borrowBook(Book book)

The method must:

Verify that the book is available.
Add the book to the member’s borrowed-books list.
Change the book’s availability to false.
Return true when the operation succeeds.
Return false when the book is unavailable.

Create:

public boolean returnBook(Book book)

The method must:

Verify that the member borrowed the book.
Remove it from the borrowed-books list.
Change its availability to true.
Return a value indicating whether the operation succeeded.

Also create:

public void displayInfo()

This method must display the member’s information and borrowed books.

Part 4: Library Class

Create:

Library.java

The Library class must contain:

private String name;
private ArrayList<Book> books;
private ArrayList<Member> members;
Constructor
public Library(String name)

The constructor must initialize empty lists for books and members.

Required Methods

Implement:

public void addBook(Book book)
public void registerMember(Member member)
public Book findBookByIsbn(String isbn)
public Member findMemberById(String membershipId)
public boolean borrowBook(String membershipId, String isbn)
public boolean returnBook(String membershipId, String isbn)
public void displayBooks()
public void displayMembers()

The borrowing and returning methods must verify that the requested book and member exist before completing the operation.

Part 5: LibraryTest Class

Create:

LibraryTest.java

The LibraryTest class must contain the main method.

Your tests must:

Create one Library object.
Create at least three Book objects.
Add the books to the library.
Create at least two Member objects.
Register both members.
Display all books and members.
Successfully borrow an available book.
Attempt to borrow the same book for another member.
Successfully return a borrowed book.
Borrow the returned book again.
Attempt to borrow a book using an invalid ISBN.
Attempt an operation using an invalid membership ID.
Display the final book availability and member borrowing records.

Use clear labels to identify each test and whether it passed or failed.

Part 6: Brief Report

Create:

Library-System-Report.md

The report should be approximately one page and include:

Design Choices

Explain:

The purpose of each class.
Why attributes are private.
Why ArrayList is used.
How the classes are related.
How book availability is managed.
Test Cases and Results

Include a table similar to this:

Test	Expected result	Actual result	Status
Add a book	Book added to library	Book displayed	Pass
Borrow available book	Borrowing succeeds	Book becomes unavailable	Pass
Borrow unavailable book	Borrowing rejected	Error message displayed	Pass
Return borrowed book	Return succeeds	Book becomes available	Pass
Invalid member ID	Operation rejected	Error message displayed	Pass
Conclusion

Briefly explain whether the program worked as expected and identify any improvements that could be added later.

General Requirements
Keep all attributes private.
Place each public class in a separate Java file.
Use constructors to initialize objects.
Include appropriate getter and setter methods.
Use ArrayList<Book> and ArrayList<Member>.
Use meaningful class, method, object, and variable names.
Follow standard Java formatting conventions.
Include comments explaining important program logic.
Do not place the main method in Book, Member, or Library.
Do not use duplicate membership IDs or ISBN values in your test data.
Test both successful and unsuccessful operations.
Ensure all Java files compile and run without errors.
Be prepared to explain your UML diagram and code.
Follow the course AI-use policy.
Record any AI assistance in AI-Use-Report.md.
Required Organization

Keep these files directly in the repository root:

- `CMP129-Week-07-Lab-01.md`
- `AI-Use-Report.md`
- `Book.java`
- `Member.java`
- `Library.java`
- `LibraryTest.java`

Do not create or use a `src` folder.


Submission

Students must push:

Book.java
Member.java
Library.java
LibraryTest.java
Lab-01/Library-UML-Diagram.pdf
Lab-01/Library-System-Report.md
Lab-01/AI-Use-Report.md

Suggested commit messages:

Add library system classes
Implement borrowing and returning functionality
Add UML diagram and testing report
