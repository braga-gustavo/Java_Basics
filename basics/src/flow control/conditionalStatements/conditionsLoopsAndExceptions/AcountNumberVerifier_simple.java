package flowControl.conditionalStatements.conditionsLoopsAndExceptions;
//Implementação Simples
import java.util.Scanner;
public class AcountNumberVerifier_simple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        String accountNumber = scanner.nextLine();
        try {
            if (accountNumber.length() != 8) {
                throw new IllegalArgumentException();
            }
            System.out.println("Invalid account number.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: Account number invalid. Please inser exactly 8 digits.");
        }
    }
}
