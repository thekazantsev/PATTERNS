package creational.singleton;

public class SingletonClassic {
    private static Object singletonObject;

    private SingletonClassic() {}

    public static synchronized Object getInstance() {
        if (singletonObject == null) {
            singletonObject = new Object();
        }
        return singletonObject;
    }
}
