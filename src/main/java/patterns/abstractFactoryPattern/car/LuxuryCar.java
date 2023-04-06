package patterns.abstractFactoryPattern.car;

import patterns.abstractFactoryPattern.location.Location;

public class LuxuryCar extends Car {

    public LuxuryCar(Location location) {
        super(CarType.LUXURY, location);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Connecting to luxury car");
    }
}
