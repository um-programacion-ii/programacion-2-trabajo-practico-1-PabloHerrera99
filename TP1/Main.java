package TP1;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("AB123CD",
                "Toyota",
                2025,
                1200.0);
        Vehicle vehicle2 = new Vehicle("XYZ789",
                "Ford",
                2019,
                1500.0);
        Vehicle vehicle3 = new Vehicle("MNP123",
                "Chevrolet",
                2010,
                1000.0);

        VehiclePrinter printer = new VehiclePrinter();
        printer.print(vehicle1);
        printer.print(vehicle2);
        printer.print(vehicle3);
    }
}
