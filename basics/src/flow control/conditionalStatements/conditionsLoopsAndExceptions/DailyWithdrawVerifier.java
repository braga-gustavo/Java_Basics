

import java.util.Scanner;

public class DailyWithdrawVerifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double dailyLimit = scanner.nextDouble();
        double withdraw = 0;

        //for implementation from github
        for (double withdrawValue = withdraw; dailyLimit >= withdrawValue; dailyLimit -= withdrawValue) {
            withdraw = scanner.nextDouble();
            if (withdraw <= dailyLimit) {
                dailyLimit -= withdraw;
                System.out.println("Withdraw done. Remaining limit:  "
                        .concat(String.valueOf(dailyLimit).concat(" Transactions closed.")));
                break;
            } else if(withdraw == 0 ) {
                System.out.println("Transaction closed");
                
            }else{
                System.out.println("Daily limit reached. Transactions closed.");
                break;
            }
        }
        scanner.close();

    }
}