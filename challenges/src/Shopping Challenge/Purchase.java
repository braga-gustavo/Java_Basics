public class Purchase implements Comparable<Purchase> {

    private Double price;
    private String description;

    public Purchase(Double price, String description)  {
        this.price = price;
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }
   
    public String getDescription() {
        return description;
    }

    @Override
    public int compareTo(Purchase otherPurchase) {
        return this.getPrice().compareTo(otherPurchase.getPrice());
    }

    @Override
    public String toString() {
        return "Purchases: \n" +" description: " + description + ", price:" + price ;
    }

    
   
    
    
}
