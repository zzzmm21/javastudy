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
//		for(int i =0 ; i<=9; i++) {
//			s2 = s2+i;
//			//new StringBuffer(s2).append(i).toString();
//			
//		}
		StringBuffer sb2 = new StringBuffer("");
		for(int i = 0 ;i <= 10000; i++) {
			sb2.append(i);
		}
		
		String s2 = sb2.toString();
		System.out.println(s2.length());

	
	
	}
}
