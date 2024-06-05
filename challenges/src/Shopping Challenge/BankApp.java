import java.util.Scanner;

public class BankApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inform credit limit: ");
        Double limitToInsert = Double.parseDouble(scanner.next());

        Account account = new Account(limitToInsert);

        String running = "yes";
        while (!running.equalsIgnoreCase("no")) {
            // Consumir a nova linha restante
            scanner.nextLine();

            System.out.println("Purchase description: ");
            String descriptionToInsert = scanner.nextLine();

            System.out.println("Purchase price: ");
            Double priceToInsert = Double.parseDouble(scanner.nextLine());

            Purchase purchase = new Purchase(priceToInsert, descriptionToInsert);
            Boolean purshased = account.addPurchase(purchase);

            if (purshased) {
                System.out.println("Purchase made");
                System.out.println("Would you like to keep shopping? yes: 'yes' or no: 'no' ");
                running = scanner.next();

            } else {
                System.out.println("Not enough credit exiting application");
                running = "no";
            }

        }

        System.out.println("=====================================");
        System.out.println("Purchases made: \n");
        for (Purchase p : account.getPurchases()) {
            System.out.println(p.getDescription()
                    .concat(" - ")
                    .concat(String.valueOf(p.getPrice())));

        }

        System.out.println("\n");
        System.out.println("========================================"
                .concat("\n ")
                .concat("Remaining credit balance: ")
                .concat(String.valueOf(account.getCreditBalance())));

    }
}
