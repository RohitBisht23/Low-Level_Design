public class FoodDeliveryFacade {
    RestraurantService restraurantService;
    DeliveryService deliveryService;

    public FoodDeliveryFacade(RestraurantService restraurantService, DeliveryService deliveryService) {
        this.restraurantService = restraurantService;
        this.deliveryService = deliveryService;
    }

    public void placeOrder() {
        restraurantService.prepareFood();
        deliveryService.assignDeliveryGuy();
        deliveryService.pickUpOrder();
        deliveryService.deliverOrder();
    }
}

