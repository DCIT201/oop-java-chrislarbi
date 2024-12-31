package ChrisLarbi.VehicleRental;

// Rental Transaction Class
class RentalTransaction {

    private Customer customer;
    private Vehicle vehicle;
    private int rentalDays;

    public RentalTransaction(Customer customer, Vehicle vehicle, int rentalDays) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.rentalDays = rentalDays;
        customer.addRental(this); // Add transaction to customer's history
    }

    // Getters and methods to process transactions.
}
