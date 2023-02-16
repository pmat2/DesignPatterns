package structural.bridge;

public class PieneapplePizza extends Pizza {

    @Override
    public void assemble() {
        System.out.printf("Pineapple pizza composition: \n%s, \n%s, \n%s%n", sauce, toppings, crust);
    }

    @Override
    public void confirmQuality() {
        System.out.println("Crust: " + crust);
    }

    @Override
    public void setToppings(String toppings) {
        super.setToppings(toppings + ", pineapple");
    }
}
