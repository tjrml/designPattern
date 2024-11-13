package decorator.code;

/**
 * Concrete Decorator: whip 데코레이터 추가
 */
public class WhipDecorator extends CoffeeDecorator{

    public WhipDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", whip";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 0.7;
    }
}
