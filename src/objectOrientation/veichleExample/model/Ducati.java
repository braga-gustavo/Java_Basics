package objectOrientation.veichleExample.model;

public class Ducati extends Veichle {

    @Override
    public void turnOn() {
        checkFuel();
        System.out.println("Ducati is on");
    }

    @Override
    public void turnOff() {
        System.out.println("Ducati is off");
    }

    @Override
    protected void checkFuel() {
        System.out.println("Ducati have fuel");
    }

}
