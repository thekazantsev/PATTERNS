package behavioral.strategy;

public interface AuthStrategy {
    boolean checkCredentials(String username, String password);
}
