package prob01;

public class Printer {

//	public void println(int i) {
//		System.out.println(i);
//	}
//
//	public void println(boolean b) {
//		System.out.println(b);
//		
//	}
//
//	public void println(double d) {
//		System.out.println(d);
//		
//	}
//
//	public void println(String string) {
//		System.out.println(string);
//		
//	}
	public <T> void println(T...ts) {
		for(T t : ts)
	
		System.out.println(t);
	}	
	
	public int sum(int... nums) {
		int sum = 0 ;
		for(int i : nums) {
			sum += i;
			
		}
		return sum;
	}
}
	
	
	
//	public <T, R, S> R println(T t , S a) {
//		R res = null;
//		return res;
//		
//	}
//	

	
	

