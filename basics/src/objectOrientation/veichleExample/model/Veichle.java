package veichleExample.model;

public abstract class Veichle   {
   
    public void turnOn() {
        System.out.println("turning on");
        checkFuel();
    }
   
    public void turnOff() {
        System.out.println("turning off");
    }

    public abstract void fuelType();

    protected void checkFuel() {
        System.out.println("Have fuel");
    }

    public void accelerate() {
       System.out.println("Accelerating");
    }

    public void deaccelerate() {
        System.out.println("Breaking");
    }

}
