package Collections.BankExample;

public class BankAccount {
    private Double accountBalance;
    private Integer accountNumber;

    public BankAccount(Double accountBalance, Integer accountNumber) {
        this.accountBalance = accountBalance;
        this.accountNumber = accountNumber;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }


}
