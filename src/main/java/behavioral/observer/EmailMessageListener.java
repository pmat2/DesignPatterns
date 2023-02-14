package behavioral.observer;

public class EmailMessageListener implements MessageListener {

    private final String email;

    public EmailMessageListener(String email) {
        this.email = email;
    }

    @Override
    public void update(Event eventType){
        // send email
    }
}
