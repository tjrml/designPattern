package factory.code.factoryMethod.stores;

import factory.code.factoryMethod.pizzas.*;

public class ChicagoPizzaStore extends PizzaStore {


    Pizza createPizza(String item) {
        return switch (item) {
            case "cheese" -> new ChicagoStyleCheesePizza();
            case "veggie" -> new ChicagoStyleVeggiePizza();
            case "clam" -> new ChicagoStyleClamPizza();
            case "pepperoni" -> new ChicagoStylePepperoniPizza();
            default -> null;
        };
    }
}
