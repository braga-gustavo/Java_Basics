package apiusage.challenges.exceptionHandling;

import java.util.Scanner;

import apiusage.Exceptions.InvalidPasswordException;

public class InvalidPassword {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert password:");
        String password = scanner.nextLine();

        try {
            validatePassword(password);
            System.out.println("Sucessully validate password");
        } catch (InvalidPasswordException e) {
            System.out.println("Error: " .concat(e.getMessage()));
        }

        scanner.close();
    }
    private static void validatePassword(String password) {
        if (password.length() < 8 || password.isBlank() || password.isEmpty()){
            throw new InvalidPasswordException("Invalid password");
        }
    }

}
