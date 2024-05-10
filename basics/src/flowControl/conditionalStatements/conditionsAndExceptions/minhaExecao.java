package flowControl.conditionalStatements.conditionsAndExceptions;

import java.util.Scanner;

public class VerificadorNumeroConta {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numeroConta;
        
        numeroConta = scanner.nextLine();
               
   
        try {
            
            verificarNumeroConta(numeroConta);

        } catch (minhaExecao e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static void verificarNumeroConta(String numeroConta) {
             if(Integer.valueOf(numeroConta.length()) != 8 ){
                throw new minhaExecao("Numero de conta invalido. Digite exatamente 8 digitos.");
             }else{
                System.out.println("Numero de conta valido.");
                
             }
    }

    
}

public class minhaExecao extends Exception{
    
    public minhaExecao(String mensagem){
        super(mensagem);
    }
    
}
