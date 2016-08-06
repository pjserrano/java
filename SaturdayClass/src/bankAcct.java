/**
 * Created by atyhu_000 on 6/30/2016.
 */
import java.util.Scanner;

public class bankAcct {



    public static void main(String[] args){

        double changeBalance = 0.00;

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter you account number ");

        int acctNumbInput = scan.nextInt();

        Account account = new Account(acctNumbInput);

        System.out.println("Your current balance is $" + account.getAccountBalance());

        do {
            System.out.println("Enter transaction amount (positive amount for deposit, negative amount for withdrawal, type 0 to exit) ");

            changeBalance = scan.nextDouble();

            double updatedBalance = account.getAccountBalance() + changeBalance;

            account.setAccountBalance(updatedBalance);

            System.out.println("Your current balance is now $" + account.getAccountBalance());


        } while(changeBalance != 0);









    }
}