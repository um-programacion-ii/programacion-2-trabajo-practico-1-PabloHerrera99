package TP1;

public class Truck extends Vehicle {
    private boolean hasTrailer;

    public Truck(String plate, String brand, int year, double carryingCapacityKg, boolean hasTrailer) {
        super(plate, brand, year, carryingCapacityKg);
        this.hasTrailer = hasTrailer;
    }

    public boolean getHasTrailer() {
        return hasTrailer;
    }

    public void setHasTrailer(boolean hasTrailer) {
        this.hasTrailer = hasTrailer;
    }
}
