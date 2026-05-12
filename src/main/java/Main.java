import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main() {
        Librarian librarian = new Librarian();

        Book Alchemist = new Book("0", " The Alchemist", "Paulo Coelho", BOOKSTATUS.AVAILABLE);
        librarian.addBook(Alchemist);
        Book WingsofFire = new Book("1", " Wings of Fire", "A. P. J. Abdul Kalam", BOOKSTATUS.AVAILABLE);
        librarian.addBook(WingsofFire);
        Book HarryPotter = new Book("2", " Harry Potter", "J. K. Rowling", BOOKSTATUS.AVAILABLE);
        librarian.addBook(HarryPotter);
        Book CleanCode = new Book("3", "Clean Code", "Robert C. Martin", BOOKSTATUS.AVAILABLE);
        librarian.addBook(CleanCode);
        Book AtomicHabits = new Book("4", "Atomic Habits", "James Clear", BOOKSTATUS.AVAILABLE);
        librarian.addBook(AtomicHabits);
        Book TheAlchemist = new Book("5", "The Alchemist", "Paulo Coelho", BOOKSTATUS.AVAILABLE);
        librarian.addBook(TheAlchemist);
        Book WingsOfFire = new Book("6", "Wings of Fire", "A. P. J. Abdul Kalam", BOOKSTATUS.AVAILABLE);
        librarian.addBook(WingsOfFire);
        Book Ikigai = new Book("7", "Ikigai", "Hector Garcia", BOOKSTATUS.AVAILABLE);
        librarian.addBook(Ikigai);
        Book DeepWork = new Book("8", "Deep Work", "Cal Newport", BOOKSTATUS.AVAILABLE);
        librarian.addBook(DeepWork);
        Book RichDadPoorDad = new Book("9", "Rich Dad Poor Dad", "Robert Kiyosaki", BOOKSTATUS.AVAILABLE);
        librarian.addBook(RichDadPoorDad);
        Book ThinkAndGrowRich = new Book("10", "Think and Grow Rich", "Napoleon Hill", BOOKSTATUS.AVAILABLE);
        librarian.addBook(ThinkAndGrowRich);
        Book PowerOfHabit = new Book("11", "The Power of Habit", "Charles Duhigg", BOOKSTATUS.AVAILABLE);
        librarian.addBook(PowerOfHabit);
        Book SherlockHolmes = new Book("12", "Sherlock Holmes", "Arthur Conan Doyle", BOOKSTATUS.AVAILABLE);
        librarian.addBook(SherlockHolmes);
        Book LordOfTheRings = new Book("13", "The Lord of the Rings", "J. R. R. Tolkien", BOOKSTATUS.AVAILABLE);
        librarian.addBook(LordOfTheRings);
        Book PrideAndPrejudice = new Book("14", "Pride and Prejudice", "Jane Austen", BOOKSTATUS.AVAILABLE);
        librarian.addBook(PrideAndPrejudice);
        Book ToKillAMockingbird = new Book("15", "To Kill a Mockingbird", "Harper Lee", BOOKSTATUS.AVAILABLE);
        librarian.addBook(ToKillAMockingbird);
        Book TheHobbit = new Book("16", "The Hobbit", "J. R. R. Tolkien", BOOKSTATUS.AVAILABLE);
        librarian.addBook(TheHobbit);
        Book DonQuixote = new Book("17", "Don Quixote", "Miguel de Cervantes", BOOKSTATUS.AVAILABLE);
        librarian.addBook(DonQuixote);
        Book MobyDick = new Book("18", "Moby Dick", "Herman Melville", BOOKSTATUS.AVAILABLE);
        librarian.addBook(MobyDick);
        Book WarAndPeace = new Book("19", "War and Peace", "Leo Tolstoy", BOOKSTATUS.AVAILABLE);
        librarian.addBook(WarAndPeace);


        Member member1 = new Student("0", "PREETHI", "preethi@gmail.com", "LIB234RD");
        librarian.addMember(member1);
        Member member2 = new Student("1", "SWATHI", "swathi@gmail.com", "LIB875QW");
        librarian.addMember(member2);
        Member member3 = new Student("2", "ARUN", "arun@gmail.com", "LIB562ZX");
        librarian.addMember(member3);
        Member member4 = new Student("3", "DIVYA", "divya@gmail.com", "LIB991PL");
        librarian.addMember(member4);
        Member member5 = new Student("4", "KARTHIK", "karthik@gmail.com", "LIB447MN");
        librarian.addMember(member5);
        Member member6 = new Student("5", "NISHA", "nisha@gmail.com", "LIB783TY");
        librarian.addMember(member6);
        Member member7 = new Student("6", "RAHUL", "rahul@gmail.com", "LIB126GH");
        librarian.addMember(member7);
        Member member8 = new Staff("7", "HEMA", "hema@gmail.com", "LIB654JK");
        librarian.addMember(member8);
        Member member9 = new Staff("8", "SURESH", "suresh@gmail.com", "LIB318VC");
        librarian.addMember(member9);
        Member member10 = new Staff("9", "LATHA", "latha@gmail.com", "LIB902BN");
        librarian.addMember(member10);

        boolean bool = true;

        int id = 10;

        Scanner scan = new Scanner(System.in);

        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Hi welcom to our Library");
        System.out.println("---------------------------------------------------------------------------");


        while (bool == true) {
            System.out.println();
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("Please enter the option below");
            System.out.println();
            System.out.println("1. Show Books in Library");
            System.out.println("2. Show Library members");
            System.out.println("3. Show the members who are Student's");
            System.out.println("4. Show the members who are Staff's");
            System.out.println("5. Register Member");
            System.out.println("6. Sign out Member");
            System.out.println("7. Borrow Book");
            System.out.println("8. Return Book");
            System.out.println("9. Reserve Book");
            System.out.println("10. Exit");

            try {
                System.out.println("---------------------------------------------------------------------------");
                System.out.print("Enter the number : ");
                int n = scan.nextInt();

                switch (n) {
                    case 1:
                        System.out.println("Book's in Library");
                        System.out.println();
                        librarian.showBooks();
                        break;
                    case 2:
                        System.out.println("Member's in Library");
                        System.out.println();
                        librarian.showMembers();
                        break;
                    case 3:
                        System.out.println("Student's in Library");
                        System.out.println();
                        Student.getStudens();
                        break;
                    case 4:
                        System.out.println("Staff's in Library");
                        System.out.println();
                        Staff.getStaffs();
                        break;
                    case 5:
                        String ID = String.valueOf(id);
                        id++;
                        System.out.println("Enter Name");
                        String name = scan.next();
                        System.out.println("Enter Mail");
                        String mail = scan.next();
                        boolean bool1 = false;
                        while (bool1 == false) {
                            System.out.println("Student or Staff");
                            String member = scan.next();
                            if (member.equals("Student")) {
                                bool1 = true;
                                Member m = new Student(ID, name, mail,LibraryIdGenerator.GeneratLibToken());
                                librarian.addMember(m);
                                System.out.println("Your Member Id : "+ID);
                                System.out.println("You Library Token Keep It Private : "+m.getLibToken());
                            } else if (member.equals("Staff")) {
                                bool1 = true;
                                Member m = new Staff(ID, name, mail,LibraryIdGenerator.GeneratLibToken());
                                librarian.addMember(m);
                                System.out.println("Your Member Id : "+ID);
                                System.out.println("You Library Token Keep It Private : "+m.getLibToken());
                            } else {
                                System.out.println("Please, Enter the text in the given format Properly --> (Student/Staff)");
                                scan.nextLine();
                            }
                        }
                        System.out.println("Registered Successfully!");
                        System.out.println();
                        break;
                    case 6:
                        System.out.println("Enter Member Id");
                        try {
                            int memberIdSignout = scan.nextInt();
                            if (memberIdSignout >= Library.members.size()) {
                                System.out.println("Invalid Member Id!");
                                break;
                            }
                            Member mSignout = Library.members.get(memberIdSignout);
                            if (mSignout == null) {
                                System.out.println("Member not found");
                                break;
                            }
                            scan.nextLine();
                            System.out.println("Enter Your Library Token to Signout");
                            String LibT = scan.nextLine();
                            if (LibT.equals(mSignout.getLibToken())){
                                int toSignoutId = Integer.parseInt(mSignout.getmemberId());
                                Library.members.set(toSignoutId,null);
                                System.out.println("Signed out Successfully!");
                            }
                            else{
                                System.out.println("Wrong Library Token!");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input! Please enter a valid numeric ID.");
                            scan.nextLine();
                        }
                        break;
                    case 7:
                        System.out.println("Book's in Library");
                        System.out.println();
                        librarian.showBooks();
                        System.out.println("Enter Book Id");
                        try {
                            int bookId = scan.nextInt();
                            if (bookId >= Library.books.size()) {
                                System.out.println("Invalid Book Id!");
                                break;
                            }
                            Book book = Library.books.get(bookId);
                            if (book.getBookStatus() != BOOKSTATUS.AVAILABLE) {
                                System.out.println(book.gettitle() + " book is not AVAILABLE!");
                                break;
                            }
                            System.out.println("Enter Member Id");
                            int memberId = scan.nextInt();
                            if (memberId >= Library.members.size()) {
                                System.out.println("Invalid Member Id!");
                                break;
                            }
                            Member m = Library.members.get(memberId);
                            Member.borrowBook(book, m);
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input! Please enter a valid numeric ID.");
                            scan.nextLine();
                        }
                        break;
                    case 8:
                        System.out.println("Enter Book Id");
                        try {
                            int bookIdR = scan.nextInt();
                            if (bookIdR >= Library.books.size()) {
                                System.out.println("Invalid Book Id!");
                                break;
                            }
                            Book bookR = Library.books.get(bookIdR);
                            if (bookR.getBookStatus() == BOOKSTATUS.AVAILABLE) {
                                System.out.println(bookR.gettitle() + " book is already available in our Library");
                                break;
                            }
                            System.out.println("How many days do you have this book with you?");
                            int days = scan.nextInt();
                            System.out.println("Enter Member Id");
                            int memberIdR = scan.nextInt();
                            if (memberIdR >= Library.members.size()) {
                                System.out.println("Invalid Member Id!");
                                break;
                            }
                            if (bookIdR >= Library.books.size()) {
                                System.out.println("This Book Id does not belongs to our library!");
                                break;
                            }
                            Member mR = Library.members.get(memberIdR);
                            Member.returnBook(bookR, days, mR);
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input! Please enter a valid numeric ID.");
                            scan.nextLine();
                        }
                        break;
                    case 9:
                        System.out.println("Book's in Library");
                        System.out.println();
                        librarian.showBooks();
                        System.out.println("Enter Book Id");
                        try {
                            int bookIdReserve = scan.nextInt();
                            if (bookIdReserve >= Library.books.size()) {
                                System.out.println("Invalid Book Id!");
                                break;
                            }
                            System.out.println("Enter Member Id");
                            int memberIdReserve = scan.nextInt();
                            if (memberIdReserve >= Library.members.size()) {
                                System.out.println("Invalid Member Id!");
                                break;
                            }
                            Book bookReserve = Library.books.get(bookIdReserve);
                            Member.reserveBook(bookReserve, memberIdReserve);
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input! Please enter a valid numeric ID.");
                            scan.nextLine();
                        }
                        break;
                    case 10:
                        System.out.println("Thank You!");
                        bool = false;
                        break;
                    default:
                        System.out.println("Please enter the valid number!");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter the number properly...");
                scan.nextLine();
            }
        }
    }
}
