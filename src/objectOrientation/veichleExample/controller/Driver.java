package objectOrientation.veichleExample.controller;

import objectOrientation.veichleExample.model.Ducati;
import objectOrientation.veichleExample.model.Subaru;

public class Driver {
    public static void main(String[] args) {
        Ducati panigale = new Ducati();
        panigale.turnOn();
        panigale.turnOff();

        Subaru imprezaWRX = new Subaru();
        imprezaWRX.turnOn();
        imprezaWRX.turnOff();
    }
}
