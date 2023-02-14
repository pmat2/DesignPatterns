package creational.prototype;

public class Impl {

    Vehicle concreteCopy(){
        VehicleCache cache = new VehicleCache();
        return cache.get("Bugatti Chiron");
    }
}
