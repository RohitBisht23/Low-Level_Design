class NetOrder extends OrderProcessTemplate{
    @Override
    public void doPayment() {
        System.out.println("Online payment through netbanking, card or payment");
    }

    @Override
    public void doDelivery() {
        System.out.println("Ship the item through post to delivery address");
    }
}
