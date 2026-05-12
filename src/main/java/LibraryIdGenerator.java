import java.util.Random;

public class LibraryIdGenerator {

    public static String GeneratLibToken() {

        Random random = new Random();

        int number = 100 + random.nextInt(900); // 100 - 999

        char firstLetter = (char) ('A' + random.nextInt(26));
        char secondLetter = (char) ('A' + random.nextInt(26));

        return "LIB" + number + firstLetter + secondLetter;
    }
}