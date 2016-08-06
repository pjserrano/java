import java.util.Scanner;

public class Asignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		double score = 0;

		System.out.println("Please enter assignment score:");
		score = input.nextDouble();

		if (score > 90 && score <= 100) {
			System.out.println("Your grade is A!");
		} else if (score >= 80 && score < 90) {
			System.out.println("your grade is B!");
		} else if (score >= 70 && score < 80) {
			System.out.println("your grade is C!");
		} else if (score >= 60 && score < 70) {
			System.out.println("your grade is D!");
		} else if (score < 60) {
			System.out.println("your grade is F!");
		}
		else { 
			System.out.println("invalid input");
		}
	}
}
