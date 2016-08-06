
public class Lab1Tas1Employee {
	
	int empId;
	String empName;
	String empAddress;
	int empPhone;
	String empEmail;
	
	public void getEmployee() {
		empId = 23423;
		empName = "Marcellus Jones";
		empAddress = "123 Testing St. Torrance CA 90760";
		empPhone = 234764556;
		empEmail = "Marcellus_Jones@itt-tech.com";
	}
	
	public void displayEmployee() {
		System.out.println("Employee Id: " + empId);
		System.out.println("Employee Name: " + empName);
		System.out.println("Employee Address: " + empAddress);
		System.out.println("Employee Phone: " + empPhone);
		System.out.println("Employee Email: " + empEmail);
	}

}
