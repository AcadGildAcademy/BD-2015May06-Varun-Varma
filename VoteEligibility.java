import java.util.Scanner;

/**
 * 
 */

/**
 * @author varunverma
 *
 */
public class VoteEligibility {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner age = new Scanner(System.in);
		System.out.println("Please enter your age!");
		short ageVoter = age.nextShort();
		if(ageVoter>=18)		
		System.out.println("Congrats ! You are eligible to Vote :) !");
		else
			System.out.println("Sorry you are not eligible to Vote :( ");
		
		age.close();

	}

}
