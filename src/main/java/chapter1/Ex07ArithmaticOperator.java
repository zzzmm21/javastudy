package chapter1;

public class Ex07ArithmaticOperator {

	public static void main(String[] args) {
		int a = 3;
		int b = 7;
		
		// binary operator
		System.out.println(a + b);// 10
		System.out.println(a - b);// -4
		System.out.println(a * b);// 21
		System.out.println(a / b);// 0
		System.out.println(a % b);//3
		
		// unary operator
		System.out.println(-a); // -3
		System.out.println(++a);
		
		// ++a , a+=1  a= a+1
		// a++ 마지막에 더함
		
		//System.out.println(a++);
		System.out.println(a);
		
		System.out.println(--a);//3
		System.out.println(a);//3
		System.out.println(a++);//3
		System.out.println(a);//4
	}

}
