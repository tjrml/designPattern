package decorator.code;

/**
 * Concrete Component: 기본 커피 클래스
 */
public class SimpleCoffee implements Coffee {

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double getCost() {
        return 2.0;
    }
}
