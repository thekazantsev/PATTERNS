package behavioral.oserver;

public class Main {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();
        publisher.addSubscriber(new SubscriberA());
        publisher.addSubscriber(new SubscriberB());

        publisher.doTheThing();
    }
}
