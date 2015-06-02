import java.util.Scanner;

/**
 * 
 */

/**
 * @author varunverma
 *
 */
public class ProgrammerResult {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner grade = new Scanner(System.in);
		boolean again=true;
		while (again) {
			System.out
					.println("Please enter your grade (A, B, C, D, E(to exit))");
			char grd = grade.next().charAt(0);
			grd = Character.toLowerCase(grd);
			switch (grd) {
			case 'a':
				System.out.println("Excellent");
				break;
			case 'b':
				System.out.println("Very Good");
				break;
			case 'c':
				System.out.println("You can do much better");
				break;
			case 'd':
				System.out.println("Need Improvement");
				break;
			case 'e':
				again=false;
				break;
			default:
				System.out.println("Wrong Grade!");

			}
		}
		grade.close();

	}

}
