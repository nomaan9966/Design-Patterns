package patterns.factoryPattern.Shape;

public class Square implements Shape {
    @Override
    public boolean accepts(String shape) {
        return shape.equalsIgnoreCase("Square");
    }

    @Override
    public String draw() {
        return "Drawing Square";
    }
}
