package patterns.factoryPattern;

import patterns.factoryPattern.Shape.Circle;
import patterns.factoryPattern.Shape.Rectangle;
import patterns.factoryPattern.Shape.Shape;
import patterns.factoryPattern.Shape.Square;

import java.util.List;

public class Draw {

    private static final List<Shape> shapes = List.of(
            new Circle(),
            new Rectangle(),
            new Square());

    public static void main(String[] args) {
        String input = "square";
        Shape result = shapes.stream()
                .filter(shape -> shape.accepts(input))
                .findFirst()
                .orElseThrow(()->new RuntimeException("No shape present for given input"));
        System.out.println(result.draw());
    }
}
