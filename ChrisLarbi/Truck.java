package com.ChrisLarbi;

public class Truck extends Vehicle {
    private double cargoFee;

    public Truck(String vehicleId, String model, double baseRentalRate, double cargoFee) {
        super(vehicleId, model, baseRentalRate);
        this.cargoFee = cargoFee;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days + cargoFee;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    @Override
    public String toString() {
        return super.toString() + ", Type=Truck";
    }
}