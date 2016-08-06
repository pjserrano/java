import java.util.ArrayList;
public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> ages = new ArrayList<Integer>();
		
		int secretNumber = ((int)Math.floor(Math.random() *9));
		int userNumber = (0);
		int i = (0);
		
		for (i = (0); i < 10; ++i) {
			
			userNumber = ((int)Math.floor(Math.random() *9));
			
			if (userNumber == secretNumber) {
				System.out.println("You are a Winner!");
				break;
			}
			
		}
		
		System.out.println("Took you " + (i + 1) + " number of tries");

	}
}
