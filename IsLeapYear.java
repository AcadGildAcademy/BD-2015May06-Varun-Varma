import java.util.Scanner;

/**
 * 
 */

/**
 * @author varunverma
 *
 */
public class IsLeapYear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Enter the year to check if it's leap or not");
		Scanner year = new Scanner(System.in);
		int isYear = year.nextInt();
		if((isYear/100==0)&&(isYear/400==0))
			System.out.println("It's a leap year");
		else
			System.out.println("Not a leap year!");
		year.close();

	}

}
