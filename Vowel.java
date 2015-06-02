import java.util.Scanner;

/**
 * 
 */

/**
 * @author varunverma
 *
 */
public class Vowel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner vowel = new Scanner(System.in);
		System.out.println("Enter the character");
		char checkVowel = vowel.next().charAt(0);
		checkVowel = Character.toLowerCase(checkVowel);
		if((checkVowel=='a') ||(checkVowel=='e')||(checkVowel=='i')||(checkVowel=='o')||(checkVowel=='u'))
			System.out.println("It is a Vowel.");
		else
			System.out.println("Not a Vowel.");

		vowel.close();
		
	}

}
