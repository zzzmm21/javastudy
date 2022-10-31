package chapter04;

public class StringTest03 {

	public static void main(String[] args) {
		// String Method 들 ....
		
		String s1 = "aBCAadc";
		System.out.println(s1.length());
		System.out.println(s1.charAt(2));
		System.out.println(s1.indexOf("Aa"));
		System.out.println(s1.indexOf("Aad",7));
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(2, 4));
		
		String s2 = "   ab   cd   ";
		String s3 = "efg, hij, klm, nop, qrs";
		String s4 = s1.concat(s3);
		System.out.println(s4);
		System.out.println(s2.trim());
		System.out.println(s2.replaceAll("",""+"===="));
		
		String[] tokens= s3.split(",");
		for(String s:tokens) {
			System.out.println(s);
		}
		String[] tokens2= s3.split(",");
		for(String s : tokens2) {
			System.out.println(s);
		}
	}

}
