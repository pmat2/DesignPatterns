package structural.bridge;

public class AmericanRestaurant extends Restaurant {

    protected AmericanRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    void addSauce() {
        pizza.setSauce("tomato sauce");
    }

    @Override
    void addToppings() {
        pizza.setToppings("cheese, bacon, burgers, french fries");
    }

    @Override
    void makeCrust() {
        pizza.setCrust("thick");
    }
}
