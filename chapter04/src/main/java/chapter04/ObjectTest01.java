package chapter04;

public class ObjectTest01 {

	public static void main(String[] args) {
		Point p = new Point(10, 20);
		
		// Class klass = p.getClass();
		
		System.out.println(p.getClass()); // reflection
		System.out.println(p.hashCode()); // address 기반의 해싱값
										  // adrress x
										  // refernence x
		System.out.println(p.toString());	// getClass() + "@"+ hashCode()
		System.out.println(p);
		
	}

}
