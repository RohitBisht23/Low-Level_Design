/*This class is a unknown class which define the payment strategy*/
public class PaymentServices {
    PaymentStretagy paymentStretagy;

    public PaymentServices(PaymentStretagy paymentStretagy) {
        this.paymentStretagy = paymentStretagy;
    }

    public void processOrder() {
        System.out.println("Proccessing order");
        paymentStretagy.processPayment();
    }
}
