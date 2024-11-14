package factory.code.abstractFactory;

import factory.code.abstractFactory.pizzas.Pizza;
import factory.code.abstractFactory.stores.ChicagoPizzaStore;
import factory.code.abstractFactory.stores.NYPizzaStore;
import factory.code.abstractFactory.stores.PizzaStore;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        // cheese
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("\nEthan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("\nJoel ordered a " + pizza + "\n");

        // clam
        pizza = nyStore.orderPizza("clam");
        System.out.println("\nEthan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("clam");
        System.out.println("\nJoel ordered a " + pizza + "\n");

        // pepperoni
        pizza = nyStore.orderPizza("pepperoni");
        System.out.println("\nEthan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("pepperoni");
        System.out.println("\nJoel ordered a " + pizza + "\n");

        // veggie
        pizza = nyStore.orderPizza("veggie");
        System.out.println("\nEthan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("\nJoel ordered a " + pizza + "\n");
    }
    
}
