package org.example;

public class AppleComputerFactory implements ComputerFactory{
    @Override
    public Computer createComputer() {
        return new AppleComputer();
    }

    @Override
    public Accessory createAccessory() {
        return new AppleAccessory();
    }
}
