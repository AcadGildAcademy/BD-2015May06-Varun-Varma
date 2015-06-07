/**
 * 
 */

/**
 * @author varunverma
 *
 */
public class InheritanceBasics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Rectangle rec = new Rectangle(5, 6);
		Rectangle tri = new Triangle(5, 6, 7);

	}

}

class Rectangle {
	int side1, side2, side3;

	public Rectangle(int a, int b) {
		side1 = a;
		side2 = b;
		System.out.println("Area:" + a * b);
	}
}

class Triangle extends Rectangle {

	public Triangle(int a, int b, int c) {

		super(a, b);
		side1 = a;
		side2 = a;
		side3 = c;
		System.out.println("Area:" + a * b * c);

	}
}