import java.util.Scanner;

/**
 * 
 */

/**
 * @author varunverma
 *
 */
public class Pallindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 System.out.print("Enter number to check if it's pallindrome.");
	       Scanner pal = new Scanner(System.in);
	       int palNum = pal.nextInt();
	       int i = palNum;
	       
	       int revs=0,rmder; 
	       while(palNum > 0) 
	       { 
	         rmder = palNum % 10; 
	         revs = revs * 10 + rmder; 
	         palNum = palNum / 10; 
	       } 
	       if(revs == i) 
	         System.out.println(i+" is a Palindrome Number!"); 
	       else
	         System.out.println(i+" is not a Palindrome Number!"); 
	       pal.close();
	       
	}

}
