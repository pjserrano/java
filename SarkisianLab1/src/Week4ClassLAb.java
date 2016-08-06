import java.util.ArrayList;
import java.util.Scanner;

public class Week4ClassLAb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> usedElements = (new ArrayList<Integer>());
		Scanner input = (new Scanner(System.in));
		String word = ("");
		String encryptedword = ("");
		
		System.out.println("Enter a word to scramble: ");
		word = input.nextLine();
		
		int randNum = (0);
		
		for (int i = (0); i < word.length(); ++i) {
			randNum = (int)Math.floor(Math.random() * word.length());
			
		while (usedElements.contains (randNum)) {
			randNum = (int)Math.floor(Math.random() * word.length());
		}
		encryptedword += word.charAt(randNum);
		usedElements.add(randNum);
	}
		System.out.println(encryptedword);
	}
}