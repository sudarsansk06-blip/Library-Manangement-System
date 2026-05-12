import java.util.ArrayList;
import java.util.List;

public class Librarian {


    //BOOK RELATED METHODS
    public void addBook(Book book) {
        Library.books.add(book);
    }

    public void removeBook(String bookId) {
        Library.books.remove(Integer.parseInt(bookId));
    }

    public void showBooks() {
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.printf("| %-20s | %-5s | %-30s | %-12s |%n",
                "AUTHOR",
                "ID",
                "TITLE",
                "STATUS");
        System.out.println("-------------------------------------------------------------------------------");
        for (Book b : Library.books) {
            System.out.printf("| %-20s | %-5s | %-30s | %-12s |%n",
                    b.getAuthor(),
                    b.getbookId(),
                    b.gettitle(),
                    b.getBookStatus());
        }
        System.out.println("---------------------------------------------------------------------------");
    }


    //MEMBER RELATED METHODS
    public void addMember(Member m) {
        if (m instanceof Staff) {
            Staff.staffs.add((Staff) m);
        } else {
            Student.students.add((Student) m);
        }
        Library.members.add(m);
    }

    public void removeMember(String memberId) {
        Library.members.remove(Integer.parseInt(memberId));
    }

    public void showMembers() {
        System.out.println("---------------------------------------------------------------------------");
        System.out.printf("%-10s %-20s %-30s %-15s%n",
                "ID", "NAME", "EMAIL ID", "BORROWED COUNT");
        System.out.println("---------------------------------------------------------------------------------------------");
        for (Member m : Library.members) {
            if (m == null) {
                System.out.println("Member Signed out from Library!");
                System.out.println("---------------------------------------------------------------------------------------------");
                continue;
            }
            System.out.printf("%-10s %-20s %-30s %-15d%n",
                    m.getmemberId(),
                    m.getMemberName(),
                    m.getMemberEmailId(),
                    m.getBorrowedBooksCount());

            System.out.println("---------------------------------------------------------------------------------------------");

            System.out.print("Borrowed Books : ");
            m.getBorrowedBooks();
            System.out.println();

            System.out.print("Reserved Books : ");
            m.getReserverBooks();
            System.out.println();

            System.out.println("---------------------------------------------------------------------------------------------");
        }
        System.out.println("---------------------------------------------------------------------------");
    }

}
