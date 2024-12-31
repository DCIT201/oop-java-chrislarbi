package com.ChrisLarbi;

import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Vehicle> fleet;

    public RentalAgency() {
        this.fleet = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public List<Vehicle> getAvailableVehicles() {
        List<Vehicle> availableVehicles = new ArrayList<>();
        for (Vehicle vehicle : fleet) {
            if (vehicle.isAvailableForRental()) {
                availableVehicles.add(vehicle);
            }
        }
        return availableVehicles;
    }

    public void rentVehicle(String vehicleId, Customer customer, int days) {
        for (Vehicle vehicle : fleet) {
            if (vehicle.getVehicleId().equals(vehicleId) && vehicle.isAvailableForRental()) {
                vehicle.setAvailable(false);
                customer.addRentalHistory(vehicle);
                System.out.println("Rental successful! Cost: " + vehicle.calculateRentalCost(days));
                return;
            }
        }
        System.out.println("Vehicle not available.");
    }

    public void returnVehicle(String vehicleId) {
        for (Vehicle vehicle : fleet) {
            if (vehicle.getVehicleId().equals(vehicleId) && !vehicle.isAvailable()) {
                vehicle.setAvailable(true);
                System.out.println("Vehicle returned successfully!");
                return;
            }
        }
        System.out.println("Vehicle not found.");
    }
}