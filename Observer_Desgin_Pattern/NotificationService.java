<<<<<<< HEAD
import java.util.*;

public class NotificationService {
    private List<Listener> customers;  // List of listeners (subscribers)

    public NotificationService(List<Listener> customers) {
        this.customers = customers;
    }

    // Method to subscribe a listener
    public void subscriber(Listener listener) {
        customers.add(listener);
    }

    // Method to unsubscribe a listener (corrected implementation)
    public void unsubscribe(Listener listener) {
        customers.remove(listener);
    }

    // Notify all subscribers
    public void updateCustomer() {
        for (Listener listener : customers) {
            listener.update();
        }
    }
}
=======
//This class have all the functionality that is common to all other services
import java.util.*;
public class NotificationService {
    List<String> customer;

    public NotificationService(List<String> customer) {
        this.customer = customer;
    }

    public void subscriber(Listener listener) {
        customer.add(listener);
    }

    public void unsubscribe(Listener listener) {
        customer.add(listener);
    }

    public void updateCustomer() {
        customer.forEach(Listener::update);
    }
}
>>>>>>> f59ca64b734c234aad887cc39deb57003e35b423
