package creational.factory.creator;

import creational.factory.product.Burger;
import creational.factory.product.VeggieBurger;

public class VeggieBurgerRestaurant extends Restaurant {
    @Override
    public Burger createBurger() {
        return new VeggieBurger();
    }
}
