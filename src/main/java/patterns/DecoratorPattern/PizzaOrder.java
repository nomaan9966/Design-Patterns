package patterns.DecoratorPattern;

import patterns.DecoratorPattern.Pizza.BasePizza;
import patterns.DecoratorPattern.Pizza.FarmhousePizza;
import patterns.DecoratorPattern.Pizza.VegDelightPizza;
import patterns.DecoratorPattern.decorators.ExtraCheese;
import patterns.DecoratorPattern.decorators.Mushroom;

public class PizzaOrder {

    public static void main(String[] args) {

        BasePizza pizza1 = new Mushroom(new ExtraCheese(new FarmhousePizza()));

        BasePizza pizza2 = new ExtraCheese(new VegDelightPizza());

        System.out.println("Pizza 1 cost : " + pizza1.cost());
        System.out.println("Pizza 2 cost : " + pizza2.cost());
    }
}
