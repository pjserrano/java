
public class Lab1Tas1Customer {
	
	int custId;
	String custName;
	String custAddress;
	int custPhone;
	String custEmail;
	
	public void getCustomer() {
		custId = 123456789;
		custName = "PeeJay Serrano";
		custAddress = "1234 Testing Ave. Torrance CA 90760";
		custPhone = 1234567890;
		custEmail = "PeeJay14@hotmail.com";
	}
	
	public void displayCustomer() {
		System.out.println("Customer Id: " + custId);
		System.out.println("Customer Name: " + custName);
		System.out.println("Customer Address: " + custAddress);
		System.out.println("Customer Phone: " + custPhone);
		System.out.println("Customer Email: " + custEmail);
		
	}

}
