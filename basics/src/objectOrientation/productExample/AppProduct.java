package productExample;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AppProduct {

    public static void main(String[] args) {

        Product p1 = new Product("Laptop", 2700.0, 150);
        Product p2 = new Product("Cellphone", 4000.0, 180);
        Product p3 = new Product("Ergonomic keyboard", 3789.0, 110);
        PerishableProduct pp = new PerishableProduct("Queijo", 20.0, 300, LocalDate.of(2024, 5, 30));

        List<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(pp);

        System.out.println("Products list has: "
                .concat(String.valueOf(products.size())
                        .concat(" itens")));

        System.out.println("Second product on the list is => ".concat(String.valueOf(products.get(1))));

        System.out.println("=============");
        System.out.println("List printed without for");
        System.out.println("=============");

        System.out.println("Full product list: ".concat(products.toString()));

        System.out.println("=============");
        System.out.println("List printed with for");
        for (Product item : products) {
            System.out.println(item);
        }
    }
}
