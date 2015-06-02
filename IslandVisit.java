import java.util.Scanner;

/**
 * 
 */

/**
 * @author varunverma
 *
 */
public class IslandVisit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner island = new Scanner(System.in);
		System.out.println("Enter the Island you want to visit & i will take you there");
		String islandToVisit = island.next();
		islandToVisit=islandToVisit.toLowerCase();
		
		switch(islandToVisit)
		{
		case "santorini":System.out.println("User want's to visit Santorini");break;
		case "lakshdweep":System.out.println("User want's to visit Lakshdweep");break;
		case "hawai":System.out.println("User want's to visit Hawai");break;
		default:System.out.println("Sorry but island you entered is not on earth may be another planet !");break;
		
		}
		island.close();

	}

}
