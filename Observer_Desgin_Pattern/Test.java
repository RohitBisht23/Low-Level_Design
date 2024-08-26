<<<<<<< HEAD
import java.util.*;
public class Test {
    public static void main(String[] args) {
        // Create a NotificationService instance with an initial empty customer list
        NotificationService notificationService = new NotificationService(new ArrayList<>());

        // Create EmailListener and MobileListener instances
        EmailListener emailListener = new EmailListener("abc@gmail.com");
        MobileListener mobileListener = new MobileListener("1234567890");

        // Subscribe listeners to the NotificationService
        notificationService.subscriber(emailListener);
        notificationService.subscriber(mobileListener);

        // Create a Store instance with the NotificationService
        Store store = new Store(notificationService);

        // Update customers (notify all subscribers)
        store.notifyAllCustomers();
    }
}
=======
public class Test {
    public static void main(String args[]) {
        EmailListener emailListener = new EmailListener("abc@gmail.com");
        NotificationService notificationService = new NotificationService();

        notificationService.subscriber(emailListener);
    }
}
>>>>>>> f59ca64b734c234aad887cc39deb57003e35b423
