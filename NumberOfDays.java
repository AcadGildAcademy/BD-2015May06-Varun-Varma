/**
 * 
 */

/**
 * @author varunverma
 *
 */
import java.util.Scanner;


public class NumberOfDays {

	public static void main(String[] args) {
		
		Scanner numofdays = new Scanner(System.in);
		String check="yes";	
		
		do{					
			System.out.println("Enter the month (for example, press 1 for january):");		
			
			int _month = numofdays.nextInt();			
			if((_month<=0) || (_month>=13))
				System.out.println("Invalid month");
		
			if(_month==2)
			{
				System.out.println("Are you asking for leap year? (Please enter 1 for yes/0 for no)");
				
				int _year = numofdays.nextInt();
				if(_year==1)
					System.out.println("Total Days are 29");
				else
					System.out.println("Total Days are 28");
				
			}
			else
			{					
				switch(_month)
				{
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12:
						System.out.println("Total Days are 31 !");
						break;
					case 2:
					case 4:
					case 6:
					case 9:
					case 11:
						System.out.println("Total Days are 30 !");
						break;				
				}
			}
			System.out.println("Wana check again? (yes/no)");
		
			check=numofdays.next();
			
		}while(check.toString().toLowerCase().equals("yes"));
		
		System.out.println("ok bye !");
		numofdays.close();
		
	}

}
