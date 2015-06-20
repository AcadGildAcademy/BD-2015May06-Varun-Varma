package Exceptionhandling;

public class StringIndex {
	public static void main(String[] args) {

		try {

			String s = new String(); 

			s="AcadGild";
			for(int i=0;i<=s.length();i++)
			
			System.out.println(s.charAt(i));

		}

		catch (StringIndexOutOfBoundsException  e) {

			System.out.println("No more string left");
		}
	}
}
