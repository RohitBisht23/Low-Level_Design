public abstract class OrderProcessTemplate {
    public abstract void doPayment();
    public abstract void doDelivery();

    public final void processOrder() {
        doPayment();
        doDelivery();
    }
}
