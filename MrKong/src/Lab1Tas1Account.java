
public class Lab1Tas1Account {
	
	int acctNo;
	String acctType;
	String acctStatus;
	double acctBalance;
	
	public void getAccount() {
		acctNo = 112121;
		acctType = "savings";
		acctStatus = "valid";
		acctBalance = 234523.00;
	}
	
	public void displayAccount() {
		System.out.println("Account No: " + acctNo);
		System.out.println("Account type: " + acctType);
		System.out.println("Account status: " + acctStatus);
		System.out.println("Account balance: " + acctBalance);
		
	}

}
