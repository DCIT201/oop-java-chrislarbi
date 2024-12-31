package ChrisLarbi.VehicleRental;

import java.util.ArrayList;
import java.util.List;

// Rental Agency Class
public class RentalAgency {

    private List<Vehicle> vehicles;

    public RentalAgency() {
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    // Other methods to manage rentals and generate reports.
}
