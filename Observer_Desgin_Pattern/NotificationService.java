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
