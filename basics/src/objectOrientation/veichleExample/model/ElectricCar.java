package veichleExample.model;

public class ElectricCar extends Veichle implements Electric    {

    private String name;

    
    @Override
    public void fuelType() {
        System.out.println("Electricity");
    }
    
    @Override
    public void electricSound(){
        System.out.println("Has no sound");
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    protected void checkFuel(){
        System.out.println("Has charge");
    }

}
