package TP1;

public class VehiclePrinter {

    public void print(Vehicle vehicle) {
        System.out.println("Vehicle:");
        System.out.println("License Plate: " + vehicle.getPlate());
        System.out.println("Brand: " + vehicle.getBrand());
        System.out.println("Year: " + vehicle.getYear());
        System.out.println("Carrying Capacity: " + vehicle.getCarryingCapacityKg());

        if (vehicle instanceof Truck truck) {
            System.out.println("Has Trailer: " + truck.getHasTrailer());
        }

        System.out.println("------------------------------");
    }
}
