package factory.code.factoryMethod.stores;

import factory.code.factoryMethod.pizzas.*;

public class NYPizzaStore extends PizzaStore {


    @Override
    Pizza createPizza(String item) {
        return switch (item) {
            case "cheese" -> new NYStyleCheesePizza();
            case "veggie" -> new NYStyleVeggiePizza();
            case "clam" -> new NYStyleClamPizza();
            case "pepperoni" -> new NYStylePepperoniPizza();
            default -> null;
        };
    }
}
