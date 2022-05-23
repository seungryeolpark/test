package ch11;

public class ShapeUse {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		System.out.println(r);
		r.x = 100;
		r.y = 200;
		r.draw();
		
		Circle c = new Circle();
		System.out.println(c);
		c.x = 300;
		c.y = 300;
		c.draw();
	}

}
