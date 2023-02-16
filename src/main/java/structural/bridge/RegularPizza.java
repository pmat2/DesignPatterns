package structural.bridge;

public class RegularPizza extends Pizza {

    @Override
    public void assemble() {
        System.out.printf("Pizza composition: \n%s, \n%s, \n%s%n", sauce, toppings, crust);
    }

    @Override
    public void confirmQuality() {
        System.out.println("Crust: " + crust);
    }
}
