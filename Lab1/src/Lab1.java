import java.util.Scanner;

public class Lab1 {

		public static void main(String[] args) {
//		// TODO Auto-generated method stub
	
//		System.out.println("Hello PeeJay Serrano");
		
		//Create a new Scanner object to read from the console
		Scanner input = new Scanner(System.in);
		
		//Ask the user for input
		System.out.println("Please enter your name here");
		
		//get the input from the user
		String yourName = input.nextLine();
		
		//concatenate the string together
		System.out.println("Hello PeeJay Serrano");
		
		System.out.println("Please tell me your favorite car from the list:");
		System.out.println("Nismo GT-R");
		System.out.println("RWB Rough Rhythm");
		System.out.println("Bentley GT-R");
		System.out.println("Corvette C7-R");
		
	
		String Car = input.nextLine();
		
		System.out.println("Your favorite car is RWB Rough Rhythm");
	
		
		System.out.println("Enter four numbers to add:");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		int number4 = input.nextInt();
		
		int addition = (number1 + number2 + number3 + number4);
		
		System.out.println("the result of"+ number1 + " "+ number2 + " "+ number3 + " "+ number4 + " is " + addition);
			
		
		System.out.println("Enter two numbers to subtract:");
		int number11 = input.nextInt();
		int number22 = input.nextInt();
		
		int subtraction = (number11 - number22);
		
		System.out.println("the result of "+ number11 + " "+ number22 + " is " + subtraction);
			
		System.out.println("Enter two numbers to multiply:");
		int number111 = input.nextInt();
		int number222 = input.nextInt();
			
		int multiplication = (number111 * number222);
			
		System.out.println("the result of "+ number111 + " "+ number222 + " is " + multiplication);
				
		System.out.println("Enter two numbers to divide:");
		int number1111 = input.nextInt();
		int number2222 = input.nextInt();
				
		int division = (number1111 / number2222);
				
		System.out.println("the result of "+ number1111 + " "+ number2222 + " is " + division);

		
	}


}

