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
