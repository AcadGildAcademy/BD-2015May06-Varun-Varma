import java.util.Scanner;

/**
 * 
 */

/**
 * @author varunverma
 *
 */
public class EvenOdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner evenOdd = new Scanner(System.in);
		System.out.println("Enter the number to check if it's even/odd");
		int num=evenOdd.nextInt();
		if(num%2==0)
			System.out.println("The number is even!");
		else
			System.out.println("The number is odd!");

		evenOdd.close();
		
	}

}
