package behavioral.strategy.strategy;

public class PaypalPayment implements PaymentStrategy {
    private String email;
    private String password;

    @Override
    public void collectPaymentDetails() {
        // Pop-up to collect PayPal mail and password...
        email = "pawel@devpro.dev";
        password = "S3cur3P455Wd!";
        System.out.println("Collecting PayPal Account Details...");
    }

    @Override
    public boolean validatePaymentDetails() {
        // Validate account...
        System.out.printf("Validating PayPal Info: "+ email + " | " + password);
        return true;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using PayPal");
    }
}
