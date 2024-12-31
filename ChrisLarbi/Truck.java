package ChrisLarbi.VehicleRental;

// Concrete Class: Truck
public class Truck extends Vehicle implements Rentable {

    private double loadCapacity;

    public Truck(String vehicleId, String model, double baseRentalRate, double loadCapacity) {
        super(vehicleId, model, baseRentalRate);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days + (loadCapacity > 1000 ? 20 * days : 0); // Additional fee for heavy loads
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    @Override
    public void rent(Customer customer, int days) {
        if (isAvailableForRental()) {
            setAvailable(false);
            System.out.println(customer.getName() + " rented " + getModel() + " for " + days + " days.");
        } else {
            System.out.println(getModel() + " is not available for rent.");
        }
    }

    @Override
    public void returnVehicle() {
        setAvailable(true);
        System.out.println(getModel() + " has been returned.");
    }
}
