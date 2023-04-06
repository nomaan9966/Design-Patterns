package patterns.factoryPattern.Shape;

public class Circle implements Shape {

    @Override
    public boolean accepts(String shape) {
        return shape.equalsIgnoreCase("Circle");
    }

    @Override
    public String draw() {
        return "Drawing Circle";
    }
}
