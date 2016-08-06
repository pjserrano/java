import java.util.Scanner;

public class BankofIttTech {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double balance = 0.00;
        double changeBalance = 0.00;
        int acctNumbInput = 0;
        
		Account account = new Account(acctNumbInput);
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to Bank Of ITT-TECH!");
		
		String keepGoing = "y";
		while (keepGoing.toUpperCase().equals("Y")) {

			System.out.println("What do you want to do?");
			System.out.println("\ta. Check Balance");
			System.out.println("\tb. Deposit");
			System.out.println("\tc. Withdrawal");
		
		String letterChoice = input.nextLine();
		
		switch (letterChoice.toUpperCase()) {
		
		case"A":
			
			System.out.println("Your current balance  is $ " + balance);	
			
			System.out.println("Do you want to continue? (y/n)");
			keepGoing = input.nextLine();
			
			break;
			
		case"B":
			
            System.out.println("Please enter positive amount to deposit ");

            changeBalance = input.nextDouble();

            double updatedBalance = account.getAccountBalance() + changeBalance;

            account.setAccountBalance(updatedBalance);

            System.out.println("Your current balance is now $" + account.getAccountBalance());

			System.out.println("Do you want to continue? (y/n)");
			keepGoing = input.nextLine();
			
			break;
			
		case"C":
			
            System.out.println("Please enter negative amount to withdraw ");

            changeBalance = input.nextDouble();

            double updatedBalance1 = account.getAccountBalance() + changeBalance;

            account.setAccountBalance(updatedBalance1);

            System.out.println("Your current balance is now $" + account.getAccountBalance());
			
			System.out.println("Do you want to continue? (y/n)");
			keepGoing = input.nextLine();
			
			break;
			
			default:
				System.out.println("invalid entry");
			
			break;
		
			}
		}
	}
}
