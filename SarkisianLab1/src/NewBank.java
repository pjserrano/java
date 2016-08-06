import java.util.Scanner;

public class NewBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double balance = 0.00;
        double changeBalance = 0.00;
        int acctNumbInput = 0;
        
		Account account = new Account(acctNumbInput);
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to Bank Of ITT-TECH!");
		System.out.println("");
		System.out.println("Please enter your 4 digits code:");
		
		String pinCode = input.nextLine();
		System.out.println("Thank you for verifying you code");
		
		String letterChoice = ( "" );
		String choice = ( "" );
		boolean keepGoing = ( true );
		
		do  {
		
			System.out.println("What do you want to do?");
			System.out.println("\ta. Check Balance");
			System.out.println("\tb. Deposit");
			System.out.println("\tc. Withdrawal");
			System.out.println("\td. End");
			
			letterChoice = input.next( );
			
			if (letterChoice.equals("a")) {
				System.out.println("Your current balance is $ " + balance);
			}
			else if (letterChoice.equals("b")) {
				System.out.println("please enter positive amount to deposit");
				
	            changeBalance = input.nextDouble();
	
	            double updatedBalance = account.getAccountBalance() + changeBalance;
	
	            account.setAccountBalance(updatedBalance);
	
	            System.out.println("Your current balance is now $" + account.getAccountBalance());
			} 
			else if (letterChoice.equals("c")) {
				System.out.println("please enter negative amount to withdraw");
				
	            changeBalance = input.nextDouble();
	
	            double updatedBalance = account.getAccountBalance() + changeBalance;
	
	            account.setAccountBalance(updatedBalance);
	
	            System.out.println("Your current balance is now $" + account.getAccountBalance());
			}
			else if (letterChoice.equals("d")) {
				System.out.println("Thank your for being loyal customer");
				break;
			} 
			
			System.out.print("Do you want to continue? (y/n): ");
			choice = input.next( );
			
			if( choice.toUpperCase().equals( "Y" ) ){
				keepGoing = ( true );
			}
			else {
				keepGoing = ( false );
			}
		} while (keepGoing == ( true ) );
	}
}

