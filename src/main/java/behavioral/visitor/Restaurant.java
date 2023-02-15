package behavioral.visitor;

import lombok.Setter;

@Setter
public class Restaurant extends Client {
    public final boolean availableAbroad;

    public Restaurant(String name, String address, String phoneNumber, boolean availableAbroad) {
        super(name, address, phoneNumber);
        this.availableAbroad = availableAbroad;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
