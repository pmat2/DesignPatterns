package behavioral.visitor;

import lombok.Setter;

@Setter
public class Restaurant extends Client {
    public final boolean serviceDelivery;

    public Restaurant(String name, String address, String phoneNumber, boolean availableAbroad) {
        super(name, address, phoneNumber);
        this.serviceDelivery = availableAbroad;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
