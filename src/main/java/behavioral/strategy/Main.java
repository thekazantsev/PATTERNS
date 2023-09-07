package behavioral.strategy;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        UserChecker userChecker = new UserChecker();
        userChecker.setUsername("freshUser");
        userChecker.setPassword("originalPassword123");

        userChecker.check(new AuthWithDB("jdbc://base"));

        userChecker.check(new AuthWithFile(new File("credentials.txt")));
    }
}
