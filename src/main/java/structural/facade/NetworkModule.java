package structural.facade;

public class NetworkModule {

    public void sendRequest(String good, double price) {
        System.out.println("Sending DB requests " + good + ":" + price);
    }
}
