/**
 * 
 */

/**
 * @author varunverma
 *
 */
public class BankOverriding {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
     Bank bnk = new Bank();
     BankIcici bnki = new BankIcici();
     BankAxis bnka = new BankAxis();
     BankSbi bnks = new BankSbi();
     
    System.out.println("Bank: "+bnk.getRateOfInterest());
    System.out.println("ICICIBank: "+bnki.getRateOfInterest());
    System.out.println("AxisBank: "+bnka.getRateOfInterest());
    System.out.println("SBIBank: "+bnks.getRateOfInterest());
		
	}

}
class Bank{
	public int getRateOfInterest(){
		return 4;
	}
}
class BankIcici{
	public int getRateOfInterest(){
		return 7;
	}
	
}
class BankSbi{
	public int getRateOfInterest(){
		return 8;
	}
	
}
class BankAxis{
	public int getRateOfInterest(){
		return 9;
	}
	
}
