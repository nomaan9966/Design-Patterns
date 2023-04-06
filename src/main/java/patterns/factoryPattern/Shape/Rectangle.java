package patterns.factoryPattern.Shape;

public class Rectangle implements Shape {
    @Override
    public boolean accepts(String shape) {
        return shape.equalsIgnoreCase("Rectangle");
    }

    @Override
    public String draw() {
        return "Drawing Rectangle";
    }
}
