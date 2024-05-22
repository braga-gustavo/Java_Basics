package productExample;

import java.time.LocalDate;
import java.util.Date;

public class PershisableProduct extends Product {

    private LocalDate expirationDate;

    public PershisableProduct(String name, Double price, Integer quantity, LocalDate expirationDate) {
        super(name, price, quantity);
        this.expirationDate = expirationDate;
    }
    
    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return ", " .concat("Expiration date: " .concat(String.valueOf(getExpirationDate())));
    }
}
