import java.util.ArrayList;

public class ThemePark {


    private ArrayList<Ride> rides;
    private ArrayList<Customer> customers;

    public ThemePark(ArrayList<Ride> rides){
        this.rides = rides;
        customers = new ArrayList<>();
    }

    public ArrayList<Ride> getRides() {
        return this.rides;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void addCustomers(Customer customerToAdd){
        this.customers.add(customerToAdd);
    }

    public boolean checkCustomerHeightForRide(Ride rideToCheckFor, Customer customerToCheck) {
        return customerToCheck.getHeight()>=rideToCheckFor.getMinimumHeight();
    }
}
