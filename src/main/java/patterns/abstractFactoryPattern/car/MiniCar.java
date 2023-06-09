package patterns.abstractFactoryPattern.car;

import patterns.abstractFactoryPattern.location.Location;

public class MiniCar extends Car {

    public MiniCar(Location location) {
        super(CarType.MINI, location);
        construct();
    }

    @Override
    void construct() {
        System.out.println("Connecting to Mini car");
    }
}
