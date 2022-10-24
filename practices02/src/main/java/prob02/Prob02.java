package prob02;

import java.util.Scanner;

public class Prob02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("5개의 숫자를 입력하시오");
		
		int[] intArray = new int[5];
		double sum = 0;
		intArray[0]= scanner.nextInt();
		intArray[1]= scanner.nextInt();
		intArray[2]= scanner.nextInt();
		intArray[3]= scanner.nextInt();
		intArray[4]= scanner.nextInt();

		/* 키보드에서 배열 크기만큼 입력 받아 배열에 저장하는 코드 */
		for(int i = 0; i < intArray.length; i++) {
			sum += intArray[i];
		}
		/* 배열에 저장된 정수 값 더하기 */
		double avg = sum / intArray.length;
		
		/* 출력 */
		System.out.println("평균:" + avg);
		
		/* 자원정리 */
		scanner.close();
	}
}
