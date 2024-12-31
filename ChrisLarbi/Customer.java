package com.ChrisLarbi;
import java.util.ArrayList;
import java.util.List;


public class Customer {
    private String name;
    private List<Vehicle> rentalHistory;

    public Customer(String name) {
        this.name = name;
        this.rentalHistory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addRentalHistory(Vehicle vehicle) {
        rentalHistory.add(vehicle);
    }

    public List<Vehicle> getRentalHistory() {
        return rentalHistory;
    }

    @Override
    public String toString() {
        return "Customer [Name=" + name + ", Rental History=" + rentalHistory.size() + " vehicles]";
    }
}