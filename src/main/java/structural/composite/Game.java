package structural.composite;

public class Game extends Product {
    public Game(String title, double price) {
        super(title, price);
    }

    @Override
    public double calculatePrice() {
        return getPrice();
    }
}
