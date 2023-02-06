package creational.abstractFactory.creator;

import creational.abstractFactory.product.AsusGpu;
import creational.abstractFactory.product.AsusMonitor;
import creational.abstractFactory.product.Gpu;
import creational.abstractFactory.product.Monitor;

public class MsiManufacturer extends Company {

    @Override
    public Gpu createGpu() {
        return new AsusGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }
}
