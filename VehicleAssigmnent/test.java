import ChrisLarbi.VehicleRental.*;

// The Main Class to Run the Program
class test {

    public static void main(String[] args) {
        RentalAgency agency = new RentalAgency();

        System.out.println("This is for demonstration purposes ");
        System.out.println(" ");
        // Create some vehicles
        Car car1 = new Car("CKD", "Land Cruiser", 50.0, true);
        Motorcycle motorcycle1 = new Motorcycle("MKD", "Kawasaki", 30.0);
        Truck truck1 = new Truck("TKD", "long vehicle", 70.0, 1200.0);

        // Add vehicles to the agency's fleet
        agency.addVehicle(car1);

        agency.addVehicle(motorcycle1);

        agency.addVehicle(truck1);


        // Create a customer
        Customer customer1 = new Customer("Chris Larbi", "CUST001");

        // Simulate renting and returning vehicles
        car1.rent(customer1, 4); // Chris Larbi rents the car for 4 days
        motorcycle1.rent(customer1, 5); // Chris Larbi rents the motorcycle for 5 days
        System.out.println();
        car1.returnVehicle(); // Chris Larbi returns the car
        System.out.println();
        motorcycle1.returnVehicle(); // Chris Larbi returns the motorcycle
        System.out.println();
        truck1.rent(customer1, 3); // Chris Larbi rents the truck for 3 days

        truck1.returnVehicle(); // Chris Larbi returns the truck
        System.out.println();
        // Displaying the rental costs for demonstration purposes
        System.out.println(" The rental cost for Car: $" + car1.calculateRentalCost(4));

        System.out.println("The rental cost for Motorcycle: $" + motorcycle1.calculateRentalCost(5));

        System.out.println("The rental cost Truck: $" + truck1.calculateRentalCost(3));
        System.out.println("This marks the end of the demonstration , THANK YOU!!!");
    }
}