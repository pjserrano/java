import java.util.Random;
import java.util.Scanner;



public class Week4Lab_1Alan {
	public static void main (String[] args ) {
	    String [] animals = { "Dog" , "Cat" , "Dino" } ;    
	    Random random = new Random();
	    String word = animals [random.nextInt(animals.length)];

	    System.out.println ( word ) ;
	    //I Simply want to shuffle the letters of word     
	    
	  //GET RANDOM LETTER
	    for (int i = 0; i< word.length(); i++ ) {

	    char c = (word.charAt(random.nextInt(word.length())));
	    System.out.print(c); 
	    } 
	}
}
	
