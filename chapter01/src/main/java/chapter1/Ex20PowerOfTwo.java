package chapter1;

public class Ex20PowerOfTwo {

	public static void main(String[] args) {
		final int POWER = 32;
		long result = 1;
		int i = 0;
		while(i < POWER) {
		
			result = result*2;
			i +=1;
			
		}
		System.out.println("2의 " + POWER + "승 " + result + "입니다.");
		
	
	}

}
