package structural.bridge;

public class Impl {

    public void makePizza(){
        AmericanRestaurant americanRestaurant = new AmericanRestaurant(new PieneapplePizza());
        americanRestaurant.deliver();

        ItalianRestaurant italianRestaurant = new ItalianRestaurant(new RegularPizza());
        italianRestaurant.deliver();
    }
}
