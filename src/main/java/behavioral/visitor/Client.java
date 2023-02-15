package behavioral.visitor;

import lombok.Data;

@Data
public abstract class Client {
    private final String name;
    private final String address;
    private final String phoneNumber;

    public abstract void accept(Visitor visitor);
}
