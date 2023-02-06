package org.example;

public class Main {
    public static void main(String[] args) {
        var appleFactory = new AppleComputerFactory();
        var appleComputer = appleFactory.createComputer();
        var apppleAccessory = appleFactory.createAccessory();

        var asusFactory = new AsusComputerFactory();
        var asusComputer = asusFactory.createComputer();
        var asusAccessory = asusFactory.createAccessory();

        appleComputer.getModelOfComputer();
        apppleAccessory.getNameOfAccessory();
        System.out.println();
        asusComputer.getModelOfComputer();
        asusAccessory.getNameOfAccessory();
    }
}