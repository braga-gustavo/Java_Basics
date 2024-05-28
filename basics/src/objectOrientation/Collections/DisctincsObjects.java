package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Collections.AnimalExample.Animal;
import Collections.AnimalExample.Dog;
import Collections.AnimalExample.Product;
import Collections.BankExample.BankAccount;
import Collections.GeometryExample.Circle;
import Collections.GeometryExample.GeometricForms;
import Collections.GeometryExample.Square;

/**
 * DisctincsObjects
 */
public class DisctincsObjects {

    public static void main(String[] args) {

        // List iteration foreach
        ArrayList<String> words = new ArrayList<>();
        words.add("Café");
        words.add("Sono");
        words.add("Agua");
        words.add("teclado");
        for (String word : words) {
            System.out.println(word);

        }
        System.out.println("\n ");

        // Object type casting

        Animal animal = new Dog();
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
        } else {
            System.out.println("no");
        }

        ArrayList<Product> products = new ArrayList<>();
        ArrayList<Product> products3 = new ArrayList<>();
        Product bed = new Product("bed", 500.0);
        Product airConditioning = new Product("air conditioning", 2500.0);
        products.add(bed);
        products.add(airConditioning);

        Double priceSum = 0.0;
        for (Product product : products) {
            priceSum = product.getPrice();
        }
        double mediumPrice = priceSum / products.size();
        System.out.println("Medium products price: ".concat(String.valueOf(mediumPrice)));

        // Gemetric forms
        Circle circle = new Circle(3.0);
        Square square = new Square(2.0, 3.0);

        ArrayList<GeometricForms> forms = new ArrayList<>();
        forms.add(square);
        forms.add(circle);

        for (GeometricForms form : forms ){
            System.out.println("Gemetric form area: " .concat(String.valueOf(form.calculateArea())));
            
        }

        BankAccount account1 = new BankAccount(1320.0, 1337);
        BankAccount account2 = new BankAccount(1930189.0, 31311);
        BankAccount account3 = new BankAccount(183938.0,7688);
        
        ArrayList<BankAccount> accountList = new ArrayList<>();
        accountList.add(account1);    
        accountList.add(account2);    
        accountList.add(account3);
        
        BankAccount biggerAccount = accountList.get(0);
        for (BankAccount account: accountList) {
            if(account.getAccountBalance() > biggerAccount.getAccountBalance());
                biggerAccount = account;
            }
           System.out.println("Account with most balance: ".concat(String.valueOf(biggerAccount.getAccountBalance())));
            
           
        Collections.sort(accountList);
        System.out.println("Accounts ordered by number: " .concat("\n").concat(String.valueOf(accountList))); 

        //Ordered from lower to bigger account number
        accountList.sort(Comparator.comparing(BankAccount:: getAccountBalance));
        System.out.println("Accounts orderder by balance: " .concat(String.valueOf(accountList)));
        
                                            
        }
}
