public class BankAccount implements Comparable<BankAccount> {
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

    @Override
    public int compareTo(BankAccount otherAccount) {
        return this.getAccountNumber().compareTo(otherAccount.getAccountNumber());

    }

    @Override
    public String toString() {
        return "BankAccount: " + accountNumber + ", balance: " + accountBalance;
    }

}
