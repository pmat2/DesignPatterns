package behavioral.visitor;

import lombok.Getter;

@Getter
public class Company extends Client {
    private final int numberOfEmployees;

    public Company(String name, String address, String phoneNumber, int numberOfEmployees) {
        super(name, address, phoneNumber);
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
