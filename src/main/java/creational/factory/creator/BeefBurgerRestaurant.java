package creational.factory.creator;

import creational.factory.product.BeefBurger;
import creational.factory.product.Burger;

public class BeefBurgerRestaurant extends Restaurant {
    @Override
    public Burger createBurger() {
        return new BeefBurger();
    }
}
