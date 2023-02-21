package structural.composite;

public class Service {
    private Box box;

    public Service() {
    }

    public void setup(Box... boxes){
        this.box = new CompositeBox(boxes);
    }

    public double calculate(){
        return box.calculatePrice();
    }
}
