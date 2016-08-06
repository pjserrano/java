import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Rock beats scissor
		// Paper beats rock
		// Scissors beat paper
		// 0 = rock
		// 1 = paper
		// 2 = scissor
		
		for (int i = (0); i < (5); ++i) {
		
		Scanner console = new Scanner(System.in);
		
		String choice = console.nextLine();
		
		if (isValid(choice)) {
			//do stuff with game
			int aIChoice = (int)(Math.random()*3);
			int personChoice = getVal(choice);
			System.out.println("You picked " + choice);
			System.out.println("The computer picked " + getAIChoice(aIChoice));
			System.out.println("You " + didPersonWin(personChoice, aIChoice));
		}
		else {
			System.out.println("That is not a valid input!");
		}
	}
	}

	
	public static String getAIChoice(int x) {
		if (x == 0) {
			return "Rock";
		}
		if (x == 1) {
			return "Paper";
		}
		if (x == 2) {
			return "Scissors";
		}
		return "null";
	}
	public static String didPersonWin(int pChoice, int computerChoice) {
		if (pChoice == 0) {
			if (computerChoice != 1) {
				if (computerChoice != 0) {
					return "WIN!";
				}
				return "Tie!";
			}
			return "Lose!";
		}
		if (pChoice == 1) {
			if (computerChoice != 2) {
				if (computerChoice != 1) {
					return "WIN!";
				}
				return "Tie!";
			}
			return "Lose!";
		}
		if (pChoice == 2) {
			if (computerChoice != 0) {
				if(computerChoice != 2) {
					return "WIN!";
				}
				return "Tie!";
			}
			return "Lose!";
		}
		return "null";
	}
	public static boolean isValid(String string) {
		if (string.equalsIgnoreCase("rock")) {
			return true;
		}
		if (string.equalsIgnoreCase("paper")) {
			return true;
		}
		if (string.equalsIgnoreCase("scissor")) {
			return true;
		}
		return false;
	}
	
	public static int getVal(String string) {
		if (string.equalsIgnoreCase("rock")) {
			return 0;
		}
		if (string.equalsIgnoreCase("paper")) {
			return 1;
		}
		else {
			return 2;
		}
	}

}

	
	
