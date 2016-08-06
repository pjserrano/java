
public class Lab1Tas1Branch {
	
	int branchCode;
	String branchAddress;
	String country;
	
	public void getBranch () {
		branchCode = 12345;
		branchAddress = "1234 testing avenue, torrane CA 90760";
		country = "USA";
	}
	
	public void displayBranch() {
		System.out.println("Branch code: " + branchCode);
		System.out.println("Branch Address: " + branchAddress);
		System.out.println("Country: " + country);
	}

}
