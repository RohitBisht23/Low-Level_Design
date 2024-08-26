<<<<<<< HEAD
public class EmailListener implements Listener {
    String email;

    public EmailListener(String email) {
        this.email = email;
    }

    @Override
    public void update() {
        System.out.println("Email notification sent to: " + email);
    }
}
=======
//This class is responsible to sending updates in email updates
public class EmailListener implements Listener{
    String email;
    EmailListener(String email) {
        this.email = email;
    }

    public void update() {
        System.out.println("Email notification is send to customer");
    }
}
>>>>>>> f59ca64b734c234aad887cc39deb57003e35b423
