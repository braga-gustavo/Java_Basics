//Implementação Simples
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        String numeroDaConta = scanner.nextLine();
        try {
            if (numeroDaConta.length() != 8) {
                throw new IllegalArgumentException();
            }
            System.out.println("Numero de conta valido.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: Numero de conta invalido. Digite exatamente 8 digitos.");
        }
    }
}
