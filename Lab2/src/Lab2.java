import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int counter = 0;
		while (counter < 5){
		
		Scanner input = new Scanner(System.in);
		
			
		System.out.println("What would you like to do?");
		System.out.println("\ta. Add two numbers.");
		System.out.println("\tb. Subtract two numbers.");
		System.out.println("\tc. Multiply two numbers.");
		System.out.println("\td. Divide two numbers.");
		System.out.println("Please enter a letter:");
		
		String letterChoice = input.nextLine();
	
		
		switch (letterChoice.toUpperCase()){
		
		case"A":
		
//		if (letterChoice.equals("a") || letterChoice.equals("A")){
			
			System.out.println("Enter two numbers to add:");
			int number1 = input.nextInt();
			int number2 = input.nextInt();
			
			int addition = (number1 + number2);
			
			System.out.println("the result of "+ number1 + " "+ number2 + " is " + addition);
		
			break;
			
		case"B":
		
//		else if (letterChoice.equals("b") || letterChoice.equals("B")){
			
			System.out.println("Enter two numbers to subtract:");
			int number11 = input.nextInt();
			int number22 = input.nextInt();
			
			int subtraction = (number11 - number22);
			
			System.out.println("the result of "+ number11 + " "+ number22 + " is " + subtraction);
		
			break;
			
		case"C":
		
//		if (letterChoice.equals("c") || letterChoice.equals("C")){
			
			System.out.println("Enter two numbers to multiply:");
			int number111 = input.nextInt();
			int number222 = input.nextInt();
				
			int multiplication = (number111 * number222);
				
			System.out.println("the result of "+ number111 + " "+ number222 + " is " + multiplication);
			
		break;
		
		case"D":
		
//		else if (letterChoice.equals("d") || letterChoice.equals("D")){

			System.out.println("Enter two numbers to divide:");
			int number1111 = input.nextInt();
			int number2222 = input.nextInt();
					
			int division = (number1111 / number2222);
					
			System.out.println("the result of "+ number1111 + " "+ number2222 + " is " + division);
			
			break;
			
			default:
				
				break;
		}
				
				
		}
		
	}
	
}


	
