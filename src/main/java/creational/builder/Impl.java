package creational.builder;

import creational.builder.model.Car;
import creational.builder.model.CarBuilder;

public class Impl {

    Car createCar(){
        CarBuilder builder = new CarBuilder();
        return builder
                .brand("Mazda")
                .color("Red")
                .engine("2.0")
                .height(105)
                .nbrOfDoors(5)
                .build();
    }
}
