package flowControl.conditionalStatements;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Integer age = 25;
        Integer age2 = 15;
       

        //variable = (condition) ? expressionTrue :  expressionFalse;
        String adult = age > 18 ? "maior de idade" : "menor de idade";
        String kid = age2 > 18 ? "maior de idade" : "menor de idade";

        System.out.println(adult);
        System.out.println(kid);


        // chainned condition with ternary operator:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Student note: ");
        Integer note = scanner.nextInt(); 

        String result = note > 7 ? "Approved" : note >=5 && note < 7 ? "Recuperação" : "Reproved";
        
        System.out.println("Student status:" + result);
    }

}