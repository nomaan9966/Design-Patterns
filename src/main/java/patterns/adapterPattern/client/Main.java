package patterns.adapterPattern.client;

import patterns.adapterPattern.adaptee.WeightMachineForBabies;
import patterns.adapterPattern.adapter.WeightMachineAdapter;
import patterns.adapterPattern.adapter.WeightMachineAdapterImpl;

public class Main {

    public static void main(String[] args) {
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdapter.getWeightInKGs());
    }
}
