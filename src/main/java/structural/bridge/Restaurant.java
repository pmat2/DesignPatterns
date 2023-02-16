package structural.bridge;

public abstract class Restaurant {
    protected Pizza pizza;

    protected Restaurant(Pizza pizza) {
        this.pizza = pizza;
    }

    abstract void addSauce();

    abstract void addToppings();

    abstract void makeCrust();

    public void deliver() {
        makeCrust();
        addSauce();
        addToppings();
        pizza.assemble();
        pizza.confirmQuality();
        System.out.println("Pizza ready!");
    }
}
