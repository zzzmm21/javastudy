package prob03;

public class Prob03 {
	public static void main(String args[]) {
		char[] CharArray = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l', '.' };

		// 원래 배열 원소 출력
		printCharArray(CharArray);

		// 공백 문자 바꾸기
		String array = String.valueOf(CharArray);
		//if 문 for문
		for(int i =0; i<CharArray.length;i++){
			
			
		}
		

		// 수정된 배열 원소 출력
		printCharArray(CharArray);
	}
	public static void printCharArray(char[] cs) {
		System.out.println(cs);
	}
}
