package chapter04;

public class StringTest04 {

	public static void main(String[] args) {
	//String s1 = "Hello " + "World "+"java "+12;
		String s1 = new StringBuffer("Hello ")
		.append("World ")
		.append(12)
		.toString();
		System.out.println(s1);
//	
//		String s2 ="";
//		for(int i =0 ; i<=100000; i++) {
//			s2 = s2+i;
//			//new StringBuffer(s2).append(i).toString();
//			
//		}
		
		// 1000000 많은 연산을 할경우 stringBuffer 처리가 더 효과적이다
		StringBuffer sb2 = new StringBuffer("");
		for(int i = 0 ; i <= 100000; i++) {
			sb2.append(i);
		}
		
		String s2 = sb2.toString();
		System.out.println(s2.length());

	
	
	}
}
