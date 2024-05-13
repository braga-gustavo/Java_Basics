// Complete implementation
package flowControl.conditionalStatements.conditionsAndExceptions;

import java.util.Scanner;
public class AccountNumberVerifier_complete {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String accountNumber;

        accountNumber = scanner.nextLine();

        try {

            verifyAccountNumber(accountNumber);

        } catch (MyException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static  void verifyAccountNumber(String accountNumber) throws MyException {
        if (Integer.valueOf(accountNumber.length()) != 8) {
            throw new MyException("Account number invalid. Please inser exactly 8 digits.");
        } else {
            System.out.println("Invalid account number.");

        }
    }
}
