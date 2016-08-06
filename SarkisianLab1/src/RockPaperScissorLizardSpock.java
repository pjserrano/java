import java.util.Scanner;

public class RockPaperScissorLizardSpock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Rock beats scissors & lizard
		// Paper beats rock & spock
		// Scissor beats paper & lizard
		// Lizard beats spock & paper
		// Spock beats scissor & rock
		// 0 = rock
		// 1 = paper
		// 2 = scissors
		// 3 = lizard
		// 4 = spock
		
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
		if (x == 3) {
			return "Lizard";
		}
		if (x == 4) {
			return "Spock";
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
			return "Loose!";
		}
		if (pChoice == 1) {
			if (computerChoice != 2) {
				if (computerChoice != 1) {
					return "WIN!";
				}
				return "Tie!";
			}
			return "Loose!";
		}
		if (pChoice == 2) {
			if (computerChoice != 0) {
				if(computerChoice != 2) {
					return "WIN!";
				}
				return "Tie!";
			}
			return "Loose!";
		}
		if (pChoice == 3) {
			if (computerChoice != 0) {
				if(computerChoice != 3) {
					return "WIN!";
				}
				return "Tie!";
			}
			return "Loose!";
		}
		if (pChoice == 4) {
			if (computerChoice != 0) {
				if(computerChoice != 4) {
					return "WIN!";
				}
				return "Tie!";
			}
			return "Loose!";
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
		if (string.equalsIgnoreCase("lizard")) {
			return true;
		}
		if (string.equalsIgnoreCase("spock")) {
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
		if (string.equalsIgnoreCase("paper")) {
			return 2;
		}
		if (string.equalsIgnoreCase("paper")) {
			return 3;
		}
		else {
			return 4;
		}
	}

}
	
	

