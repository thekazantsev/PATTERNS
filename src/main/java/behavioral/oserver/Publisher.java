package behavioral.oserver;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private final List<PublisherSubscriber> subscribers = new ArrayList<>();

    public void addSubscriber(PublisherSubscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void removeSubscriber(PublisherSubscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public List<PublisherSubscriber> getSubscribers() {
        return subscribers;
    }

    public void clearSubscribersList() {
        subscribers.clear();
    }

    public void doTheThing() {
        System.out.println("Publisher do the thing");
        notifySubscribers();
    }

    private void notifySubscribers() {
        for (PublisherSubscriber subscriber : subscribers) {
            subscriber.notification("Hello from Publisher");
        }
    }
}
