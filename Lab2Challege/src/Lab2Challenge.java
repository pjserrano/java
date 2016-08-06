import java.util.Scanner;

public class Lab2Challenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		String keepGoing = "y";
		while (keepGoing.toUpperCase().equals("Y")) {

			System.out.println("There are three primary colors, When they are combined you get secondary colors:");
			System.out.println("1. Red");
			System.out.println("2. Yellow");
			System.out.println("3. Blue");
			System.out.println("Please enter your first primary color.");

			String colorChoice = input.nextLine();

			switch (colorChoice.toUpperCase()) {

			case "RED":

				System.out.println("Please enter your second primary color.");

				colorChoice = input.nextLine();

				if (colorChoice.equals("yellow")) {

					System.out.println("Your secondary color is orange.");
				} else if (colorChoice.equals("blue")) {

					System.out.println("Your secondary color is purple.");
				}

				System.out.println("Do you want to continue? (y/n)");
				keepGoing = input.nextLine();

				break;

			case "YELLOW":

				System.out.println("Please enter your second primary color.");

				colorChoice = input.nextLine();

				if (colorChoice.equals("red")) {

					System.out.println("Your secondary color is orange.");
				} else if (colorChoice.equals("blue")) {

					System.out.println("Your secondary color is green.");
				}

				System.out.println("Do you want to continue? (y/n)");
				keepGoing = input.nextLine();

				break;

			case "BLUE":

				System.out.println("Please enter your second primary color.");

				colorChoice = input.nextLine();

				if (colorChoice.equals("yellow")) {

					System.out.println("Your secondary color is green.");
				} else if (colorChoice.equals("red")) {

					System.out.println("Your secondary color is purple.");
				}

				System.out.println("Do you want to continue? (y/n)");
				keepGoing = input.nextLine();

				break;

			default:

				System.out.println("invalid entry");

				break;

			}
		}
	}
}
