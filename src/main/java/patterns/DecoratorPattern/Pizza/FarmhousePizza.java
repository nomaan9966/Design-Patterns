package patterns.DecoratorPattern.Pizza;

public class FarmhousePizza extends BasePizza {
    @Override
    public int cost() {
        return 200;
    }
}
