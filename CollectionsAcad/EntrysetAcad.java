package CollectionsAcad;

import java.util.*;

public class EntrysetAcad {
	 public static void main(String args[]) {
		   // create hash map
		   HashMap newmap = new HashMap();
		      
		   // populate hash map
		   newmap.put(1, ".Net");
		   newmap.put(2, "JAVA");
		   newmap.put(3, "Python");
		      
		   // create set view for the map
		   Set set=newmap.entrySet();
		      
		   // check set values
		   System.out.println("Set values: " + set);
		   }    
}
