package patterns.nullObjectPattern;

public class VehicleFactory {

    public static Vehicle getVehicle(String typeOfVehicle) {
        if ("Car".equalsIgnoreCase(typeOfVehicle)) {
            return new Car();
        } else if ("Bike".equalsIgnoreCase(typeOfVehicle)) {
            return new Bike();
        } else {
            return new NullVehicle();
        }
    }
}
