package chapter1;

/*
 * 리터널(literal)이란 프로그램에서 직접적으로 표현되는 상수이다.
 *  
 */

public class EX02Literal {
	public static void main(String[] args) {
		float f = 3.14f; 
		double d = 3.14;
		
		short s = 1;            // *java 제공하는 기본타입 8가지 *
		int i = 1;				//
		long l = 123456789041L;
		
		char c = 'A';
		byte b = 97;
		
		boolean bool = true;

		System.out.println(s);
		System.out.println(l);
		System.out.println(i);
		
		System.out.println(c);
		System.out.println(b);
		System.out.println(bool);
		System.out.println(d);
	}
}
