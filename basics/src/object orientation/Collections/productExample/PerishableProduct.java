package Collections.productExample;

import java.time.LocalDate;

public class PerishableProduct extends Product {

    private LocalDate expirationDate;

    public PerishableProduct(String name, Double price, Integer quantity, LocalDate expirationDate) {
        super(name, price, quantity);
        this.expirationDate = expirationDate;
    }
    
    public LocalDate getExpirationDate() {
        return expirationDate;
    }

   @Override
   public String toString() {
       
       return super.toString()
       .concat( ", "
       .concat("Expiration date: " 
       .concat(String.valueOf(getExpirationDate()))));
   }
}
