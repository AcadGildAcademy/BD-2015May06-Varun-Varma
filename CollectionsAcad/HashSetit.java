package CollectionsAcad;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetit {

	public static void main(String args[]) {
		// create hash set
		HashSet<String> newset = new HashSet<String>();

		// populate hash set
		newset.add("AcadGild");
		newset.add("Java");
		newset.add("Big Data");

		// create an iterator
		Iterator iterator = newset.iterator();

		// check values
		while (iterator.hasNext()) {
			System.out.println("Value: " + iterator.next() + " ");
		}
	}

}
