public class Main {
    public static void main(String[] args) {
        RestraurantService restraurantService = new RestraurantService();
        DeliveryService deliveryService = new DeliveryService();

        FoodDeliveryFacade foodDeliveryFacade = new FoodDeliveryFacade(restraurantService, deliveryService);

        foodDeliveryFacade.placeOrder();
    }
}
