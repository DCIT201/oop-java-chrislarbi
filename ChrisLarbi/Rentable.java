package ChrisLarbi.VehicleRental;

// Rentable Interface
interface Rentable {
    void rent(Customer customer, int days);

    void returnVehicle();
}
