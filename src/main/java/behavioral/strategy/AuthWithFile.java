package behavioral.strategy;

import java.io.File;

public class AuthWithFile implements AuthStrategy {

    private final File file;

    public AuthWithFile(File file) {
        this.file = file;
    }

    @Override
    public boolean checkCredentials(String username, String password) {
        System.out.println("Cheking Auth with file");
        return checkFomFile();
    }

    private boolean checkFomFile() {
        // reading data from file
        return true;
    }
}
