public abstract class PizzaDecorator implements Pizza {
    Pizza basePizza;

    public PizzaDecorator(Pizza pizza) {
        this.basePizza = pizza;
    }

    @Override
    public void createPizza() {
        // first create base pizza
        this.basePizza.createPizza();
    }

}
