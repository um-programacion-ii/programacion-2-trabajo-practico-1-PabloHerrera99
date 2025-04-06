package TP1;

public class VehiclePrinter {

    public void print(Vehicle vehicle) {
        System.out.println("Vehicle:");
        System.out.println("License Plate: " + vehicle.getPlate());
        System.out.println("Brand: " + vehicle.getBrand());
        System.out.println("Year: " + vehicle.getYear());
        System.out.println("Carrying Capacity: " + vehicle.getCarryingCapacityKg());
        System.out.println("------------------------------");
    }
}
