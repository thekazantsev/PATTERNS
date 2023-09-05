package creational.factorymethod;

public class Bike implements Transport {

    @Override
    public void drive() {
        System.out.println("Bike drive");
    }

    @Override
    public void stop() {
        System.out.println("Bike stop");
    }
}
