package Exceptionhandling;

public class ParseNum {

	public static void main(String[] args) {

		try {

			int a = Integer.parseInt("Acadgild");

			System.out.println(a);

		}

		catch (NumberFormatException e) {

			System.out.println("It can't be parsed");
		}
	}
}
