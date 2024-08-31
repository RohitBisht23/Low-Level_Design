public class Mushroom extends PizzaDecorator {

    public Mushroom(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void createPizza() {
        // Create base pizza
        super.createPizza();
        // Add mushroom-specific creation
        System.out.println("Adding mushrooms");
    }
}
