package behavioral.visitor;

public interface Visitor {
    void visit(Company company);

    void visit(Restaurant restaurant);
}
