import java.util.*;

public class SentenceScrambler{
  public static void main(String [] args){
	  
     Scanner input = new Scanner(System.in);
     String sentence = input.next();
     String[] words = sentence.split(",");
 
     for (int i = 0; i < words.length; i++) {
        StringBuffer buffer = new StringBuffer(words[i]);
        buffer = buffer.reverse();
        String rev = buffer.toString();
        System.out.print(rev + " ");
     }
  }
}