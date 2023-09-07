package behavioral.strategy;

public class AuthWithDB implements AuthStrategy {

    private Object dbRef;
    private String dbUrl;

    public AuthWithDB(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    @Override
    public boolean checkCredentials(String username, String password) {
        System.out.println("Cheking Auth with DB");
        String usernameHash = getHash(username);
        String passwordHash = getHash(password);
        return checkUser(usernameHash, passwordHash);
    }

    private boolean checkUser(String usernameHash, String passwordHash) {
        createConnection(dbUrl);
        // checking credentials in DB
        return true;
    }

    private void createConnection(String dbUrl) {
        // dbRef = ...
    }

    private String getHash(String value) {
        return String.valueOf(value.hashCode());
    }
}
