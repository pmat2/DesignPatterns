package creational.factory;

import creational.factory.creator.BeefBurgerRestaurant;
import creational.factory.creator.Restaurant;
import creational.factory.creator.VeggieBurgerRestaurant;
import creational.factory.product.Burger;

public class Impl {

    Burger prepareBurger(BurgerType burgerType) {
        Restaurant restaurant;
        switch (burgerType){
            case BEEF:
                restaurant = new BeefBurgerRestaurant();
                break;
            case VEGGIE:
                restaurant = new VeggieBurgerRestaurant();
                break;
            default:
                throw new IllegalArgumentException();
        }
        return restaurant.orderBurger();
    }
}
