import java.util.Scanner;

/**
 * 
 */

/**
 * @author varunverma
 *
 */
public class AreaCircle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner radius = new Scanner(System.in);
		System.out.println("Enter teh radius of the circle to calculate the area!");
		float rad= radius.nextFloat();
		AreaCirlce ac = new AreaCirlce(rad);
		System.out.println("Area is:"+ac.area(ac.rad));
		radius.close();

	}

}

class AreaCirlce{
	float rad;
	public AreaCirlce(float rad)
	{
		this.rad=rad;
	}
	public float area(float rad){
		return (float) (3.14*rad*rad);
	}
	
}