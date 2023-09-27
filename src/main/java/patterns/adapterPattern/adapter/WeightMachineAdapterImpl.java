package patterns.adapterPattern.adapter;

import patterns.adapterPattern.adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter{

    WeightMachine weightMachine;

    public WeightMachineAdapterImpl(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }

    @Override
    public double getWeightInKGs() {
        double weightInPounds = weightMachine.getWeightInPounds();
        return weightInPounds * 0.45;
    }
}
