public class MobileListener implements Listener{
    String number;
    MobileListener(String number) {
        this.number = number;
    }

    public void update() {
        System.out.println("SMS sent to on mobile phone of the customer");
    }
}
