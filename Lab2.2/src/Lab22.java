import java.util.Scanner;

public class Lab22 {
	
//	private static Scanner input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int counter = 0;
//		
//		while (counter < 10){
//			
//			System.out.println(counter);
//			counter++;			
//		}
//		do{
//			
//			System.out.println(counter);
//			counter--;
//			
//		}
//		
//		while (counter >= 0);
//
//		for (int i = 0; i < 10; i++){
//			
//			System.out.println(i);
//		}
//	}
//}
		
		
		Scanner input = new Scanner(System.in);

		String keepGoing = "y";
		while (keepGoing.toUpperCase().equals("Y")){
			
			System.out.println("Do you want to continue? (y/n)");
			keepGoing = input.nextLine();
		}
		
	}
}
