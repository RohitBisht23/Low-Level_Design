// This class is responsible for creating objects of pizza
public class PizzaFactory {
    public static Pizza getPizza(String pizzaType) {
        if ("CHEEZE".equals(pizzaType)) {
            return new CheezePizza();
        } else if ("LOADED".equals(pizzaType)) { 
            return new LoadedPizza();
        } else {
            throw new IllegalArgumentException("Unknown pizza type: " + pizzaType);
        }
    }
}