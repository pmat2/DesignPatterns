package behavioral.visitor;

import java.util.List;

public class MessagingVisitor implements Visitor {

    public void sendMails(List<Client> clients) {
        for (Client client : clients) {
            client.accept(this);
        }
    }

    @Override
    public void visit(Company company) {
        System.out.println("Sending message to company: " + company.getName());
    }

    @Override
    public void visit(Restaurant restaurant) {
        System.out.println("Sending message to restaurant: " + restaurant.getName());
    }
}
