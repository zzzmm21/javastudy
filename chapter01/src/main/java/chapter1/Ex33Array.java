package chapter1;

public class Ex33Array {

	public static void main(String[] args) {
		int[] intArray;
		intArray = new int[5]; 
		intArray[0] = 3;
		intArray[1] = 6;
		intArray[2] = 9;

		int result = 0;
		for ( int i =0; i < intArray.length; i++ ){
		     result = result + intArray[i];
		}
		System.out.println("result:"+result);
		//  배열의 요소는 지정 안하면 초기화 된다.
		// 정수, 실수 : 0, 객체: null 
		System.out.println("intArray의 4번째 값: " + intArray[3]);


	}

}
