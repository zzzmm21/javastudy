package chapter1;

import java.util.Scanner;

public class Ex31ScannerTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 정수 입력 받기
		System.out.println("상품 정보를 입력 하세요.:");
		
		String name = scanner.next();
		System.out.println("이름:");
		
		
		System.out.println("가격:");	
		int price = scanner.nextInt();
		
		
		System.out.println("재고량:");	
		int countstock = scanner.nextInt();
		
		System.out.println(name + ":"+ price+":"+ countstock);
		
		scanner.close();
	}

}
