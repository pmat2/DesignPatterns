package behavioral.strategy;

import lombok.Data;

@Data
public class CreditCard {
    private final String number;
    private final String expiryDate;
    private final String ccv;
    private int amount = 1_000;
}
