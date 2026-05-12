import java.util.ArrayList;
import java.util.List;

public class Member {
    private String memberId;
    private String memberName;
    private String memberEmailId;
    private List<Book> borrowedBooks = new ArrayList<>();
    private List<Book> reservedBooks = new ArrayList<>();
    private int borrowedBooksCount = 0;
    private String LibToken;

    Member(String memberId, String memberName, String memberEmailId, String LibToken) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.memberEmailId = memberEmailId;
        this.LibToken = LibToken;
    }

    public String getmemberId() {
        return memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public String getMemberEmailId() {
        return memberEmailId;
    }

    public String getLibToken() { return LibToken;}

    public void getBorrowedBooks() {
        for (Book b : borrowedBooks) {
            System.out.print("|| (bookId : " + b.getbookId() + ")" + " (Title : " + b.gettitle() + ") || ");
        }
    }

    public void getReserverBooks() {
        for (Book b : reservedBooks) {
            System.out.print("|| (bookId : " + b.getbookId() + ")" + " (Title : " + b.gettitle() + ") || ");
        }
    }

    public int getBorrowedBooksCount() {
        return borrowedBooksCount;
    }


    public static void borrowBook(Book book, Member member) {

        String bookId = book.getbookId();
        String memberId = member.memberId;
        if (Library.books.get(Integer.parseInt(bookId)).getBookStatus() != BOOKSTATUS.AVAILABLE) {
            System.out.println(book.gettitle() + " book is not AVAILABLE!");
            return;
        }
        if (member instanceof Student && member.borrowedBooksCount < 1) {
            if (Integer.parseInt(memberId) > Library.books.size()) {
                System.out.println("This BookID was not having in our library");
            } else {
                Library.books.get(Integer.parseInt(bookId)).setBookStatus(BOOKSTATUS.B0RROWED);
                member.borrowedBooks.add(Library.books.get(Integer.parseInt(bookId)));
                Library.members.get(Integer.parseInt(memberId)).borrowedBooksCount++;
                System.out.println("Thank you for borrowing the" + book.gettitle() + " book from our Library, " + member.getMemberName() + ", We Hope that you will return it without any Damage!");
            }
        } else if (member instanceof Staff && member.borrowedBooksCount < 2) {
            if (Library.books.get(Integer.parseInt(bookId)).getBookStatus() != BOOKSTATUS.AVAILABLE) {
                System.out.println("BookID " + bookId + " Not AVAILABLE!");
            } else if (Integer.parseInt(memberId) > Library.books.size()) {
                System.out.println("This BookID was not having in our library");
            } else {
                Library.books.get(Integer.parseInt(bookId)).setBookStatus(BOOKSTATUS.B0RROWED);
                member.borrowedBooks.add(Library.books.get(Integer.parseInt(bookId)));
                Library.members.get(Integer.parseInt(memberId)).borrowedBooksCount++;
                System.out.println("Thank you for borrowing the" + book.gettitle() + " book from our Library, " + member.getMemberName() + ", We Hope that you will return it without any Damage!");
            }
        } else {
            System.out.println("Hey " + member.getMemberName() + " your maximum amount of book limit's was reached!");
        }
    }

    public static void returnBook(Book book, int Days, Member member) {
        String bookId = book.getbookId();
        if (Integer.parseInt(bookId) >= Library.books.size()) {
            System.out.println("This Book does not belongs to our library!");
        } else if (Library.books.get(Integer.parseInt(bookId)).getBookStatus() == BOOKSTATUS.AVAILABLE) {
            System.out.println("Hey " + member.getMemberName() + ", " + book.gettitle() + " book is Already AVAIALBE! this book is not from our library");
        } else {
            boolean issueBook = false;
            for (Book b : member.borrowedBooks) {
                if (b.getbookId() == bookId) {
                    issueBook = true;
                    Library.books.get(Integer.parseInt(bookId)).setBookStatus(BOOKSTATUS.AVAILABLE);
                    if (Days > 0) {
                        System.out.println("Your Fees was : " + Days * 50 + "rs");
                        System.out.println("Thank you returning the book " + member.getMemberName());
                    }
                }
            }
            if (issueBook == false) {
                System.out.println("In our record, we didn't issue this book to you!");
            }


        }
    }

    public static void reserveBook(Book book, int memberIdReserve) {

        String bookId = book.getbookId();
        if (Integer.parseInt(bookId) > Library.books.size()) {
            System.out.println("Sorry! we don't have this book");
        } else if (Library.books.get(Integer.parseInt(bookId)).getBookStatus() != BOOKSTATUS.AVAILABLE) {
            System.out.println(book.gettitle() + " is Not AVAILABLE!");
        } else {
            Member member = Library.members.get(memberIdReserve);
            member.reservedBooks.add(book);
            Library.books.get(Integer.parseInt(bookId)).setBookStatus(BOOKSTATUS.RESERVED);
            System.out.println(book.gettitle() + " was reserved to Member Id : " + member.memberId + " (" + memberInstance(member) + " " + member.getMemberName() + ")");
        }
    }

    private static String memberInstance(Member m) {
        if (m instanceof Student) {
            return "Student";
        }
        return "Staff";
    }
}
