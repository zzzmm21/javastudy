package paint;

public class Main {

	public static void main(String[] args) {
		
		Point pt1 = new Point(10, 50);
		// pt1.setX(10);
		// pt1.setY(50);
		
		drawPoint(pt1);
		//pt.disappear();
		pt1.show(false);
		
		Point pt2 = new ColorPoint(100,200,"red");
		//pt2.setX(100);
		//pt2.setY(200);
		//((ColorPoint)pt2).setColor("red");
		
		//drawColorPointI(pt2);
		drawPoint(pt2);
		pt2.show(false);
		pt2.show(true);
		
		Triangle triangle = new Triangle ();
		//drawTriangle(triangel);
		drawShape(triangle);
		
		Rectangle rectangle = new Rectangle();
		drawShape(rectangle);
		
		Circle circle = new Circle();
		drawShape(circle);
		
	}
	public static void draw(IDrawble drawble) {
		
	}

	public static void drawShape(Shape shape) {
		shape.draw();
		
	}
	public static void drawPoint(Point pt) {
		pt.show();
	}
	// public static void drawColorPointI(ColorPoint pt) {
	// 	pt.show();
	//}
	
}
