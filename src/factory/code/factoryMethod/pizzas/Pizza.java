package factory.code.factoryMethod.pizzas;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void prepare() {
        System.out.println("Prepare " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding Sauce...");
        System.out.println("Adding toppings:");
        for (String topping : toppings) {
            System.out.println("  " + topping);
        }
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cut the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String toString() {
        StringBuilder display = new StringBuilder();
        display.append("---- ")
                .append(name)
                .append(" ----\n")
                .append("Dough: ")
                .append(dough)
                .append("\n")
                .append("Sauce: ")
                .append(sauce)
                .append("\n");
        for (String topping : toppings) {
            display.append("Topping: ")
                    .append(topping)
                    .append("\n");
        }

        return display.toString();
    }
}
