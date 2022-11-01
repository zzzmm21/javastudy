package prob6;

public class Rectangle  implements Resizable{
	private double width;
	private double height;
	public Rectangle(int width, int height) {
		this.width  = width;
		this.height = height;
	}
	@Override
	public void resize(double s) {
		s = width * height;
	}
	
}
