import java.util.Scanner;

public class Get5Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("please chose a number between 1 to 5.");

		int numChoice = input.nextInt();
		
		if (numChoice == 0 ) {
			System.out.println("That number is odd number");
				
		} else if( numChoice == (0) ) {
		
			System.out.println("That number is even number");
		}
	}
}