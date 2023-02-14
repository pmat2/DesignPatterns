package creational.abstractFactory;

import creational.abstractFactory.creator.AsusManufacturer;
import creational.abstractFactory.creator.Company;
import creational.abstractFactory.creator.MsiManufacturer;
import creational.abstractFactory.product.Product;

import java.util.List;

public class Impl {

    void createProducts(){
        Company msi = new MsiManufacturer();
        Company asus = new AsusManufacturer();

        List.of(msi.createGpu(),
                        msi.createMonitor(),
                        asus.createGpu(),
                        asus.createMonitor()
                )
                .forEach(Product::assemble);
    }
}
