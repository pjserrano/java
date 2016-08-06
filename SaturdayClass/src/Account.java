/**
 * Created by atyhu_000 on 6/30/2016.
 */
public class Account {

    int accountNumber;
    double accountBalance = 0.00;

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public int getAccountNumber() {

        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
    }
}
