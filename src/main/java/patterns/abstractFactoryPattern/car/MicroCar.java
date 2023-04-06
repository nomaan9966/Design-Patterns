package patterns.abstractFactoryPattern.car;

import patterns.abstractFactoryPattern.location.Location;

public class MicroCar extends Car {
    public MicroCar(Location location)
    {
        super(CarType.MICRO, location);
        construct();
    }
    @Override
    protected void construct()
    {
        System.out.println("Connecting to Micro Car ");
    }
}
