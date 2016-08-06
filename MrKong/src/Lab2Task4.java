import java.util.Scanner;

public class Lab2Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String numChoice = ("");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a number between 1 to 7");
		
		numChoice = input.nextLine();
		
		if (numChoice.equals("1")) {
			System.out.println("Sunday");
		}
		else if (numChoice.equals("2")) {
			System.out.println("Monday");
		}
		else if (numChoice.equals("3")) {
			System.out.println("Tuesday");
		}
		else if (numChoice.equals("4")) {
			System.out.println("Wednesday");
		}
		else if (numChoice.equals("5")) {
			System.out.println("Thurday");
		}
		else if (numChoice.equals("6")) {
			System.out.println("Friday");
		}
		else if (numChoice.equals("7")) {
			System.out.println("Saturday");
		} else {
			System.out.println("That number is invalid!");
			System.out.println("Please enter a number between 1 to 7");
			
		}
		

	}

}
