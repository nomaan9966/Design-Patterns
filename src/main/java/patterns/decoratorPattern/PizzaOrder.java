package patterns.decoratorPattern;

import patterns.decoratorPattern.Pizza.BasePizza;
import patterns.decoratorPattern.Pizza.FarmhousePizza;
import patterns.decoratorPattern.Pizza.VegDelightPizza;
import patterns.decoratorPattern.decorators.ExtraCheese;
import patterns.decoratorPattern.decorators.Mushroom;

public class PizzaOrder {

    public static void main(String[] args) {

        BasePizza pizza1 = new Mushroom(new ExtraCheese(new FarmhousePizza()));

        BasePizza pizza2 = new ExtraCheese(new VegDelightPizza());

        System.out.println("Pizza 1 cost : " + pizza1.cost());
        System.out.println("Pizza 2 cost : " + pizza2.cost());
    }
}
