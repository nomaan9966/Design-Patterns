package patterns.nullObjectPattern;

public class Bike implements Vehicle{
    @Override
    public int getTankCapacity() {
        return 10;
    }

    @Override
    public int getSeatingCapacity() {
        return 2;
    }
}
