package TP1;

import java.time.Year;

public class Vehicle {
    private String plate;
    private String brand;
    private int year;
    private double carryingCapacityKg;

    public Vehicle(String plate, String brand, int year, double carryingCapacityKg) {
        setPlate(plate);
        setBrand(brand);
        setYear(year);
        setCarryingCapacityKg(carryingCapacityKg);
    }

    public String getPlate() {
        return plate;
    }
    public void setPlate(String plate) {
        if (plate == null || plate.trim().isEmpty()) {
            throw new IllegalArgumentException("Plate cannot be null");
        }
            this.plate = plate;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        if (brand == null || brand.trim().isEmpty()) {
            throw new IllegalArgumentException("Brand cannot be null");
        }
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {

        int currentYear = Year.now().getValue();

        if (year <= 1600 || year > currentYear) {
            throw new IllegalArgumentException("Year must be between 1600 and "+ currentYear);
        }
        this.year = year;
    }

    public double getCarryingCapacityKg() {
        return carryingCapacityKg;
    }
    public void setCarryingCapacityKg(double carryingCapacityKg) {
        if (carryingCapacityKg <= 0) {
            throw new IllegalArgumentException("Carrying capacity must be greater than 0");
        }
        this.carryingCapacityKg = carryingCapacityKg;
    }

    public void showInformation() {
        System.out.println("Vehicle: " + brand +
                " - " + year +
                " - Plate: " + plate +
                " - Carrying Capacity: " + carryingCapacityKg);
    }
}