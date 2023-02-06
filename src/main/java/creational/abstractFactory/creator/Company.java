package creational.abstractFactory.creator;

import creational.abstractFactory.product.Gpu;
import creational.abstractFactory.product.Monitor;

public abstract class Company {

    public abstract Gpu createGpu();

    public abstract Monitor createMonitor();
}
