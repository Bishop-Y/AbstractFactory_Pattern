package org.example;

public class Main {
    public static void main(String[] args) {
        ComputerFactory appleFactory = new AppleComputerFactory();
        Computer appleComputer = appleFactory.createComputer();
        Accessory apppleAccessory = appleFactory.createAccessory();

        ComputerFactory asusFactory = new AsusComputerFactory();
        Computer asusComputer = asusFactory.createComputer();
        Accessory asusAccessory = asusFactory.createAccessory();

        appleComputer.getModelOfComputer();
        apppleAccessory.getNameOfAccessory();
        System.out.println();
        asusComputer.getModelOfComputer();
        asusAccessory.getNameOfAccessory();
    }
}