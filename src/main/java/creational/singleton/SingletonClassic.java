package creational.singleton;

public class SingletonClassic {
    private static Object object;

    private SingletonClassic() {}

    public static synchronized Object generate() {
        if (object == null) {
            object = new Object();
        }
        return object;
    }
}
