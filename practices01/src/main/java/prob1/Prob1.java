package prob1;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		System.out.println("수를 입력하시오:");
		Scanner scanner = new Scanner( System.in );
		int i = scanner.nextInt();{
			
			if(i%3==0) {
				System.out.println("3의배수입니다");
			}
			else {
				System.out.println("3의배수가 아닙니다");
			}
			
		}
		scanner.close();
	}
}
