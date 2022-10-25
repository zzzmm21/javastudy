package prob01;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in  );
		
		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		
		
			int price = 0;
	
			
			for(int i=0; i<MONEYS.length;i++) {
				price += MONEYS[i];
			int a = MONEYS[0] / 50000;
			int b = MONEYS[i] / 10000 ;
			int c = MONEYS[i] / 5000;
			int d = MONEYS[i] / 1000;
			int e = MONEYS[i] / 500;
			int f = MONEYS[i] / 100;
			int g = MONEYS[i] / 50 ;
			int h = MONEYS[i] / 10;
		System.out.println("액수:");
		price = scanner.nextInt();
		/* 코드 작성 */
		System.out.println("50000원:" +a+"개");
		System.out.println("10000원:"+ b +"개");
		System.out.println("5000원:"+c+"개");
		System.out.println("1000원:"+d+"개");
		System.out.println("500원:"+e+"개");
		System.out.println("100원:"+f+"개");
		System.out.println("50원:"+g+"개");
		System.out.println("10원:"+h+"개");
		
		}
		scanner.close();
 	}
}