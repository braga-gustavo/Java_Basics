import java.util.ArrayList;
import java.util.List;

public class Account {

    private Double creditLimit;
    private List<Purchase> purchases;
    private Double creditBalance;

    public Account(Double creditLimit) {
        this.creditLimit = creditLimit;
        this.creditBalance = creditLimit;
        this.purchases = new ArrayList<>();
    }

    public boolean addPurchase(Purchase purchase) {
        if (creditBalance >= purchase.getPrice()) {
            this.creditBalance -= purchase.getPrice();
            this.purchases.add(purchase);
            return true;
        }
        return false;
    }

    public List<Purchase> getPurchases() {
        return purchases;
    }

    public Double getCreditLimit() {
        return creditLimit;
    }

    public Double getCreditBalance() {
        return creditBalance;
    }
    

}
