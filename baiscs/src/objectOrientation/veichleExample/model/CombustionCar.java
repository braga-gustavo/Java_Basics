package objectOrientation.veichleExample.model;

public class CombustionCar extends Veichle implements Combustion    {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void fuelType() {
        System.out.println("Gas");
    }

    @Override
    public void combustionSound() {
        System.out.println("Engine Roaring");
    }

    
}
