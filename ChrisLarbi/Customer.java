package ChrisLarbi.VehicleRental;

import java.util.ArrayList;
import java.util.List;

// Customer Class
public class Customer {

    private String name;
    private String customerId;
    private List<RentalTransaction> rentalHistory;

    public Customer(String name, String customerId) {
        this.name = name;
        this.customerId = customerId;
        this.rentalHistory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getCustomerId() {
        return customerId;
    }

    // Add methods to manage rental history.
    public void addRental(RentalTransaction transaction) {
        rentalHistory.add(transaction);
    }
}
