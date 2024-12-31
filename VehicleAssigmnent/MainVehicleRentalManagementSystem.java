package ChrisLarbi.VehicleRental;

// Main Class to Run the Program
class VehicleRentalManagementSystem {

    public static void main(String[] args) {
        RentalAgency agency = new RentalAgency();

        // Create some vehicles
        Car car1 = new Car("C001", "Toyota Camry", 50.0, true);
        Motorcycle motorcycle1 = new Motorcycle("M001", "Harley Davidson", 30.0);
        Truck truck1 = new Truck("T001", "Ford F-150", 70.0, 1200.0);

        // Add vehicles to the agency's fleet
        agency.addVehicle(car1);
        agency.addVehicle(motorcycle1);
        agency.addVehicle(truck1);

        // Create a customer
        Customer customer1 = new Customer("Alice", "CUST001");

        // Simulate renting and returning vehicles
        car1.rent(customer1, 4); // Alice rents the car for 3 days
        motorcycle1.rent(customer1, 5); // Alice rents the motorcycle for 2 days

        car1.returnVehicle(); // Alice returns the car
        motorcycle1.returnVehicle(); // Alice returns the motorcycle

        truck1.rent(customer1, 3); // Alice rents the truck for 5 days

        truck1.returnVehicle(); // Alice returns the truck

        // Displaying the rental costs for demonstration purposes
        System.out.println("Rental cost for Car: $" + car1.calculateRentalCost(4));
        System.out.println("rental cost for Motorcycle: $" + motorcycle1.calculateRentalCost(5));
        System.out.println("rental cost Truck: $" + truck1.calculateRentalCost(3));
    }
}
