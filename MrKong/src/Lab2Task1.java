import java.util.Scanner;

public class Lab2Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner input = new Scanner(System.in);
		
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		int number4 = input.nextInt();
		
		int math = (number1 * number2 + number3 / number4);
		
		System.out.println(math);

	}

}
