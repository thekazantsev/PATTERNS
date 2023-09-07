package behavioral.oserver;

public class SubscriberB implements PublisherSubscriber {
    @Override
    public void notification(String text) {
        System.out.println("SubscriberB received notification: " + text);
    }
}
