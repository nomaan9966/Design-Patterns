package patterns.nullObjectPattern;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle1 = VehicleFactory.getVehicle("bike");
        Vehicle vehicle2 = VehicleFactory.getVehicle("truck");

        System.out.println("Vehicle Tank Capacity : " + vehicle1.getTankCapacity());
        System.out.println("Vehicle seat Capacity : " + vehicle1.getSeatingCapacity());

        System.out.println("Vehicle Tank Capacity : " + vehicle2.getTankCapacity());
        System.out.println("Vehicle seat Capacity : " + vehicle2.getSeatingCapacity());
    }
}
