package prob06;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			/*  코드를 완성 합니다 */
			System.out.print( ">> " );
			String expression = scanner.nextLine();
			
			if( "quit".equals( expression ) ) {
				break;
			}
			
			String[] tokens = expression.split( " " );
			
			if( tokens.length != 3 ) {
				System.out.println( ">> 알 수 없는 식입니다.");
				continue;
			}
			
			int lValue = Integer.parseInt( tokens[ 0 ] );
			int rValue = Integer.parseInt( tokens[ 2 ] );
			
			switch( tokens[ 1 ] ) {
				case "+" : {
					Arith add = new Arith(rValue, rValue, rValue, rValue);
					add.add(lValue, rValue);
					int result = add.getAdd();
					System.out.println( ">> " + result );
					
					break;
				}
				case "-" : {
					Arith sub = new Arith(rValue, rValue, rValue, rValue);
					sub.sub( lValue, rValue );
					int result = sub.getSub();
					System.out.println( ">> " + result );
					
					break;
				}
				case "*" : {
					Arith mul = new Arith(rValue, rValue, rValue, rValue);
					mul.mul( lValue, rValue );
					int result = mul.getMul();
					System.out.println( ">> " + result );
					
					break;					
				}
				case "/" : {
					Arith div = new Arith(rValue, rValue, rValue, rValue);
					div.div( lValue, rValue );
					int result = div.getDiv();
					System.out.println( ">> " + result );
					
					break;
				}
				default :  {
					System.out.println( ">> 알 수 없는 연산입니다.");
				}
			}
		}
		
		scanner.close();

	}

}
