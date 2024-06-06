package apiusage.challenges.exceptionHandling;

import java.util.Scanner;

public class InvalidDivison {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert the first value: ");
        Integer firstValue = scanner.nextInt();

        System.out.println("Insert the second value: ");
        Integer secondValue = scanner.nextInt();

        try {
            Integer division = firstValue/secondValue;
            System.out.println("Result: ".concat(String.valueOf(division)));
        } catch (ArithmeticException e ) {
            System.out.println("Can't divide by zero");
        }
    }

}
