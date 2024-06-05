package Collects.productExample;


/**
 * Product
 */
public class Product {

    private String name;
    private Double price;
    private Integer quantity;

    public Product(String name, Double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {

        return "Name: "
                .concat(this.getName())
                .concat(", ")
                .concat(" Price: ")
                .concat(String.valueOf(this.getPrice())
                .concat(", ")   
                .concat(" Quantity: ")
                .concat(String.valueOf((this.getQuantity()))));
    }

}