/* NOTE SEPARATE ALL CLASSES AND INTERFACE IN DIFFERENT FILES.
This class describes the problem. Here this is an interface
*/
public interface CreatePizzaInterface {
    void createPizza();
}

// Public top-level class for CheesePizza
public class CheesePizzaClass implements CreatePizzaInterface {
    @Override
    public void createPizza() {
        System.out.println("CheesePizza object created");
    }
}

// LoadedPizzaClass.java
public class LoadedPizzaClass implements CreatePizzaInterface {
    @Override
    public void createPizza() {
        System.out.println("Loaded pizza object created");
    }
}

public class createPizzaInterface {
    public static void main(String[] args) {
        CreatePizzaInterface pizza = null;
        String pizzaType = "CHEEZE";  // Initialize pizzaType

        if ("CHEEZE".equals(pizzaType)) {
            pizza = new CheesePizzaClass();
        } else if ("LOADED".equals(pizzaType)) {
            pizza = new LoadedPizzaClass();
        }

        if (pizza != null) {
            pizza.createPizza();  // Ensure pizza is not null before calling createPizza
        } else {
            System.out.println("Unknown pizza type");
        }
    }
}


/*
Here this code is not extensible because if customer only wants pizza who is small and cheeze then
we will need to create the object like this in if-else block, so this voilating DRY principle
which days DO NOT REPEAT YOURSELF
Also if i have large code base then if i want to new pizzas then i will need to modify the code
which voilate 'O' principle

TO resolve this issue we use FACTORY PRINCIPLE.
 */