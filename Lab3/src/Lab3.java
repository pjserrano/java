import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Scanner(System.in);

		int size = 10;
		int[] listOfRandomNumbers = new int[size];

		for (int counter = 0; counter < listOfRandomNumbers.length; counter++) {
			listOfRandomNumbers[counter] = randInt(0, 10);
		}

		int counter = 0;
		while (counter < listOfRandomNumbers.length)
		{
			System.out.println(listOfRandomNumbers[counter]);
			counter++;
		}
	}

	/**
	 * Returns a pseudo-random number between min and max, inclusive. the
	 * difference between min and max can be at most
	 * <code>Integer.MAX_VALUE - 1</code>.
	 * 
	 * @param min
	 *            Minimum value
	 * @param Max
	 *            Minimum value. Must be greater than min.
	 * @return Integer between min and max, inclusive.
	 * @see java.utilRandom#nextInt(int)
	 */
	public static int randInt(int min, int max) {

		// if min is 0 and max is 10 then this will provide us a random number between 0 -10
		int randomNum = min + ((int) (Math.random() * (max - min) + 1));

		return randomNum;
	}

	public static int HighestNumber(int[] myArray) {

		int highestNumber = 0;

		// get the first number
		highestNumber = myArray[0];

		for (int counter = 0; counter < myArray.length; counter++)

		{
			if (highestNumber < myArray[counter]) {
				highestNumber = myArray[counter];
			}
		}
		return highestNumber;
	}
}
