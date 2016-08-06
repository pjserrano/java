import java.util.Scanner;

public class Get100Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a number between 1 to 100");
		
		System.out.println("Enter two numbers to add:");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		
		int addition = (number1 + number2);
		
		System.out.println("the result of "+ number1 + " "+ number2 + " is " + addition);
		
	}

}
