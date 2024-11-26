package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class ConcreteNewsAgency implements NewsAgency {
    private List<Subscriber> subscribers;

    public ConcreteNewsAgency() {
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        if (!subscribers.contains(subscriber)) {
        subscribers.add(subscriber);
        System.out.println("Subscriber " + ((NewsSubs) subscriber).getName() + " added.");
        }
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        if (subscribers.remove(subscriber)) {
            System.out.println("Subscriber " + ((NewsSubs)subscriber).getName() + " removed.");
        }
    }

    public void notifySubscribers(String news) {
        System.out.println("Notifying " + subscribers.size() + " subscribers about: " + news);
        for (Subscriber subscriber : subscribers) {
            subscriber.update(news);
        }
    }
    
}