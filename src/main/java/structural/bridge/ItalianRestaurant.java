package structural.bridge;

public class ItalianRestaurant extends Restaurant {

    protected ItalianRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    void addSauce() {
        pizza.setSauce("tomato sauce");
    }

    @Override
    void addToppings() {
        pizza.setToppings("cheese, basil, tomatoes, olives");
    }

    @Override
    void makeCrust() {
        pizza.setCrust("thin");
    }
}
