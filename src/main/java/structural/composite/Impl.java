package structural.composite;

public class Impl {

    public void composite(){
        Service service = new Service();
        service.setup(
                new CompositeBox(
                        new Game("game", 1000)
                ),
                new CompositeBox(
                        new CompositeBox(
                                new Book("Harry Pottah", 25),
                                new Book("Book", 10)
                        ),
                        new Book("The Hitchhiker's Guide to the Galaxy", 120)
                ),
                new Game("Tetris", 10)
        );
        service.calculate();
    }
}
