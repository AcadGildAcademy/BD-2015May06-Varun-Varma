public class MethodOverloading {

	public static void main(String[] args) {
		RectangleOv rec = new RectangleOv();
		RectangleOv sqr = new RectangleOv(5);
		RectangleOv rec1 = new RectangleOv(5, 6);
	    
		System.out.println("Area:" +  rec.len * rec.bdth);
		System.out.println("Area:" + sqr.len * sqr.bdth);
		System.out.println("Area:" + rec1.len * rec1.bdth);
	}
}

class RectangleOv {
	int len;
	int bdth;

	public RectangleOv() {
		this.len = 0;
		this.bdth = 0;
	}

	public RectangleOv(int a) {
		
		this.len = a;
		this.bdth = a;
	}

	public RectangleOv(int a, int b) {
		
		this.len = a;
		this.bdth = b;
	}
}