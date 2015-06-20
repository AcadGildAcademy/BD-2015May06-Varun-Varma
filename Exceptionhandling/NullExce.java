/**
 * 
 */
package Exceptionhandling;

/**
 * @author varunverma
 *
 */
public class NullExce {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			String a = null;
			System.out.println(a.toString());
		}

		catch (NullPointerException e) {

			System.out.println("nothing found");
		}

	}

}
