package patterns.decoratorPattern.Pizza;

public class FarmhousePizza extends BasePizza {
    @Override
    public int cost() {
        return 200;
    }
}
