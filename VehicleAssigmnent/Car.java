package ChrisLarbi.VehicleRental;

// Concrete Class: Car
public class Car extends Vehicle implements Rentable {
    private boolean hasAirConditioning;

    public Car(String vehicleId, String model, double baseRentalRate, boolean hasAirConditioning) {
        super(vehicleId, model, baseRentalRate);
        this.hasAirConditioning = hasAirConditioning;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days + (hasAirConditioning ? 10 * days : 0);
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
