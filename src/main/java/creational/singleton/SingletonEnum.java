package creational.singleton;

public enum SingletonEnum {
    INSTANCE(new Object());

    private final Object object;

    SingletonEnum(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }
}
