package paint;

public class Main {

	public static void main(String[] args) {
		
		Point pt1 = new Point(10, 50);
		// pt1.setX(10);
		// pt1.setY(50);
		draw(pt1);
		//	drawPoint(pt1);
		//pt.disappear();
		pt1.show(false);
		
		Point pt2 = new ColorPoint(100,200,"red");
		//pt2.setX(100);
		//pt2.setY(200);
		//((ColorPoint)pt2).setColor("red");
		
		//drawColorPointI(pt2);
		//drawPoint(pt2);
		draw(pt2);
		pt2.show(false);
		pt2.show(true);
		
		Triangle triangle = new Triangle ();
		//drawTriangle(triangel);
		//drawShape(triangle);
		draw(triangle);
		
		Rectangle rectangle = new Rectangle();
		//drawShape(rectangle);
		draw(rectangle);
		
		Circle circle = new Circle();
		//drawShape(circle);
		draw(circle);
		
		GraphicText gt = new GraphicText("Hello World");
		draw(gt);
		// instanceof test
		System.out.println(circle instanceof Object);
		System.out.println(circle instanceof Shape);
		System.out.println(circle instanceof Circle);
		// 오류 : class는 hierachy 상위와 하위만 instanceof 연산자를 사용할 수 있다.
		// System.out.println(circle instanceof Rectangle);
		
		// 하지만, interface는 hierachy와 상관없이 instanceof 연산자를 사용 할 수 있다.
		System.out.println(circle instanceof Drawble);
		System.out.println(circle instanceof Runnable);
		
		
	}
	public static void draw(Drawble drawble) {
		drawble.draw();
	}

//	public static void drawShape(Shape shape) {
//		shape.draw();
		
//	}
	//public static void drawPoint(Point pt) {
	//	pt.show();
	//}
	// public static void drawColorPointI(ColorPoint pt) {
	// 	pt.show();
	//}
	
}
