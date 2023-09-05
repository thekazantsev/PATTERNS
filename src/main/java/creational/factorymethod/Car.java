package creational.factorymethod;

public class Car implements Transport {

    @Override
    public void drive() {
        System.out.println("Car drive");
    }

    @Override
    public void stop() {
        System.out.println("Car stop");
    }
}
