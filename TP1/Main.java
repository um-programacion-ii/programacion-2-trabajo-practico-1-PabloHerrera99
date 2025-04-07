package TP1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Vehicle("AB123CD",
                "Toyota",
                2025,
                1200.0));
        vehicles.add(new Vehicle("XYZ789",
                "Ford",
                2019,
                1500.0));
        vehicles.add(new Vehicle("MNP123",
                "Chevrolet",
                2010,
                1000.0));
        vehicles.add(new Truck("OPQ345",
                "Volvo",
                2015,
                12000.0,
                true));
        vehicles.add(new Truck("RS678TO",
                "Volvo",
                2024,
                15000,
                false));
        vehicles.add(new Car("GH678IJ",
                "Honda",
                2020,
                500,
                2));

        VehiclePrinter printer = new VehiclePrinter();
        for (Vehicle vehicle : vehicles) {
            printer.print(vehicle);
        }
    }
}
