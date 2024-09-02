public class StoreOrder extends OrderProcessTemplate{
    @Override
    public void doPayment() {
        System.out.println("Pay at counter through cash/POS");
    }

    @Override
    public void doDelivery() {
        System.out.println("Item delivered to at delivery counter");
    }
}
