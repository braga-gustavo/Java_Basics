package objectOrientation.veichleExample.controller;

import objectOrientation.veichleExample.model.CombustionCar;
import objectOrientation.veichleExample.model.ElectricCar;

public class Driver {
    public static void main(String[] args) {

        System.out.println("\n");
        System.out.println("------------------------");
        System.out.println("\n");
        
        CombustionCar combustionCar1 = new CombustionCar();
        combustionCar1.setName("Subaru Impreza WRX STI '01");

        System.out.println(combustionCar1.getName());
        combustionCar1.turnOn();
        combustionCar1.accelerate();
        combustionCar1.combustionSound();
        combustionCar1.turnOff();
       
        System.out.println("\n");
        System.out.println("------------------------");
        System.out.println("\n");


        ElectricCar electricCar1 = new ElectricCar();
        electricCar1.setName("Tesla Model 3 ");

        System.out.println(electricCar1.getName());
        electricCar1.turnOn();
        electricCar1.accelerate();
        electricCar1.deaccelerate();
        electricCar1.electricSound();
        electricCar1.turnOff();
    }
}
