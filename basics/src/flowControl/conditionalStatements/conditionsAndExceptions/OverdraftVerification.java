package flowControl.conditionalStatements.conditionsAndExceptions;

import java.util.Scanner;

public class OverdraftVerification {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double balance = scanner.nextDouble();
        double withdraw = scanner.nextDouble();
        double overdraftLimit = 500;

        if (withdraw > balance) {
            if (withdraw < overdraftLimit + balance) {
                System.out.println("Transaction successfully completed using overdraft limit.");

            } else {
                System.out.println("Transaction not compeleted. Exceeded overdraft limit.");
            }
        } else {
            System.out.println("Transaction successfully completed.");
        }


        scanner.close();

    }

}