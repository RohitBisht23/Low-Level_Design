public class Test {
    public static void main(String[] args) {
        PaymentByCard paymentByCard = new PaymentByCard();
        PaymentServices paymentServices1 = new PaymentServices(paymentByCard);
        paymentServices1.processOrder();

        PaymentByUPI paymentByUPI = new PaymentByUPI();
        PaymentServices paymentServices2 = new PaymentServices(paymentByUPI);
        paymentServices2.processOrder();
    }
}
