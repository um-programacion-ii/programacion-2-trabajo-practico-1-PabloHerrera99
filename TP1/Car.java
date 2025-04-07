package TP1;

public class Car extends Vehicle {
    private int passengersCount;

    public Car(String plate, String brand, int year, double carryingCapacityKg, int passengersCount) {
        super(plate, brand, year, carryingCapacityKg);
        this.passengersCount = passengersCount;
    }

    public int getPassengersCount() {
        return passengersCount;
    }

    public void setPassengersCount(int passengersCount) {
        this.passengersCount = passengersCount;
    }
}