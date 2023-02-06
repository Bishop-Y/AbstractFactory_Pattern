package org.example;

public class AsusComputerFactory implements ComputerFactory{
    @Override
    public Computer createComputer() {
        return new AsusComputer();
    }

    @Override
    public Accessory createAccessory() {
        return new AsusAccessory();
    }
}
