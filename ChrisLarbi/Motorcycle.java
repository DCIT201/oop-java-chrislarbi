package ChrisLarbi.VehicleRental;

// Concrete Class: Motorcycle
public class Motorcycle extends Vehicle implements Rentable {

    public Motorcycle(String vehicleId, String model, double baseRentalRate) {
        super(vehicleId, model, baseRentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days;
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
