import java.util.Scanner;

public class Lab2Task44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a number between 1 to 7");
		
		String numChoice = input.nextLine();
		
		switch (numChoice) {
		
		case"1":
			System.out.println("Sunday");
			break;
			
		case"2":
			System.out.println("Monday");
			break;
			
		case"3":
			System.out.println("Tuesday");
			break;
			
		case"4":
			System.out.println("Wednesday");
			break;
			
		case"5":
			System.out.println("Thursday");
			break;
			
		case"6":
			System.out.println("Friday");
			break;
			
		case"7":
			System.out.println("Saturday");
			break;
			
			default:
				System.out.println("That number is invalid!");
				System.out.println("Please enter a number between 1 to 7");
				break;
		}
		
	}

}