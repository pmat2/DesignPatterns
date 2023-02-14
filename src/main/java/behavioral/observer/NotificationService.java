package behavioral.observer;

import java.util.*;

public class NotificationService {

    private final Map<Event, List<MessageListener>> customers;

    public NotificationService() {
        customers = new HashMap<>();
        Arrays.stream(Event.values())
                .forEach(event -> customers.put(event, new ArrayList<>()));
    }

    public void subscribe(Event eventType, MessageListener listener) {
        customers.get(eventType).add(listener);
    }

    public void unsubscribe(Event eventType, MessageListener listener) {
        customers.get(eventType).remove(listener);
    }

    public void notifyCustomers(Event eventType) {
        customers.get(eventType)
                .forEach(listener -> listener.update(eventType));
    }
}
