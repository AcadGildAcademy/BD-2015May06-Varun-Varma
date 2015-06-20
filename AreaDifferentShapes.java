class Circle implements IShape
{

	@Override
	public void Getarea() {
		System.out.println("Area");
		
	}

	@Override
	public void Draw() {System.out.println("Draw");
	
		
	}
	

}

public class AreaDifferentShapes {

	public static void main(String args[])
	{
		Circle c = new Circle();
		c.Getarea();
		c.Draw();
	}
}

