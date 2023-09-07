package behavioral.oserver;

public class SubscriberA implements PublisherSubscriber {
    @Override
    public void notification(String text) {
        System.out.println("SubscriberA received notification: " + text);
    }
}
