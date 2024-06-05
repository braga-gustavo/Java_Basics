
import java.util.Scanner;

// Aqui é definido uma classe chamada VerificadorElegibilidadeConta:
public class AccountEligibityVerifier {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade = scanner.nextInt();
        if (idade >= 18) {
            System.out.println("Your are not eligible to create an account.");
        } else {
            System.out.println("Your are not eligible to create a bank account.");
        }

        scanner.close();
    }
}