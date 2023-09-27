package patterns.adapterPattern.adaptee;

public class WeightMachineForBabies implements WeightMachine{
    @Override
    public double getWeightInPounds() {
        return 28;
    }
}
