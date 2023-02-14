package behavioral.observer;

public class MobileMessageListener implements MessageListener {

    private final String username;

    public MobileMessageListener(String username) {
        this.username = username;
    }

    @Override
    public void update(Event eventType) {
        // send mobile push notification
    }
}
