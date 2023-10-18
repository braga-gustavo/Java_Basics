package objectOrientation.veichleExample.model;

public class Subaru extends Veichle {

    @Override
    public void turnOn() {
        checkFuel();
        System.out.println("Subaru on");
    }

    @Override
    public void turnOff() {
        System.out.println("Subaru off");
    }

    @Override
    protected void checkFuel() {
        System.out.println("Subaru have fuel");
    }

}
