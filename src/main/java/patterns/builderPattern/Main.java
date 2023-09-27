package patterns.builderPattern;

public class Main {

    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder()
                .setRAM("8")
                .setHDD("1024")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(false)
                .build();
    }
}
