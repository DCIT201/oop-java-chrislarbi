package com.ChrisLarbi;

public class Motorcycle extends Vehicle {
    private double helmetFee;

    public Motorcycle(String vehicleId, String model, double baseRentalRate, double helmetFee) {
        super(vehicleId, model, baseRentalRate);
        this.helmetFee = helmetFee;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days + helmetFee;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    @Override
    public String toString() {
        return super.toString() + ", Type=Motorcycle";
    }
}