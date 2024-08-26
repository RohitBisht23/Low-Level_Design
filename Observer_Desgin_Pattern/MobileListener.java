<<<<<<< HEAD
public class MobileListener implements Listener {
    String number;

    public MobileListener(String number) {
        this.number = number;
    }

    @Override
    public void update() {
        System.out.println("SMS sent to mobile phone number: " + number);
    }
}
=======
public class MobileListener implements Listener{
    String number;
    MobileListener(String number) {
        this.number = number;
    }

    public void update() {
        System.out.println("SMS sent to on mobile phone of the customer");
    }
}
>>>>>>> f59ca64b734c234aad887cc39deb57003e35b423
