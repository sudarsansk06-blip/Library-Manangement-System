import java.util.ArrayList;
import java.util.List;

public class Staff extends Member {
    Staff(String memberId, String memberName, String memberEmailId,String LibToken) {
        super(memberId, memberName, memberEmailId,LibToken);
    }

    public static List<Staff> staffs = new ArrayList<>();

    public static void getStaffs() {
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.printf("| %-10s | %-20s | %-30s | %-15s |%n",
                "ID", "NAME", "EMAIL ID", "BORROWED");

        System.out.println("---------------------------------------------------------------------------------------------------");
        for (Staff m : staffs) {
            if (m == null) {
                System.out.println("---------------------------------------------------------------------------------------------------");
                System.out.println("Member Signed out from Library!");
                System.out.println("---------------------------------------------------------------------------------------------------");
                continue;
            }
            System.out.println("---------------------------------------------------------------------------------------------------");

            System.out.printf("| %-10s | %-20s | %-30s | %-15d |%n",
                    m.getmemberId(),
                    m.getMemberName(),
                    m.getMemberEmailId(),
                    m.getBorrowedBooksCount());

            System.out.println("---------------------------------------------------------------------------------------------------");

            System.out.print("Borrowed Books : ");
            m.getBorrowedBooks();
            System.out.println();

            System.out.print("Reserved Books : ");
            m.getReserverBooks();
            System.out.println();

            System.out.println("---------------------------------------------------------------------------------------------------");
        }
        System.out.println("---------------------------------------------------------------------------");
    }
}
