package chapter1;

public class Ex11LogicalOperator {

	public static void main(String[] args) {
		// !(not)  	 
		// !true => false
		// !false => true
		System.out.println(!(3 != 2)); // false
		
		// &&(and , 논리곱)
		// true and false => false
		// false and true => false 
		// true and true => true
		System.out.println(3 != 2 && 3> 4); // false

		
		// ||(or, 논리합)
		// true or false => true
		// false or true => true 
		// false or false =? false
		// true or true => true	
		System.out.println(3 != 2 || -1 > 0); // true

		// ^ (xor , 배타적 논리합)
		

		// true ^ false => true
		// false ^ true => true 
		// false ^ false =? false
		// true ^ true => false
		System.out.println(3 != 2 ^ -1 > 0); // true

	}

}
