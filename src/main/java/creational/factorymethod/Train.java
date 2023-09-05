package creational.factorymethod;

public class Train implements Transport {

    @Override
    public void drive() {
        System.out.println("Train drive");
    }

    @Override
    public void stop() {
        System.out.println("Train stop");
    }
}
