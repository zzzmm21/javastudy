package chapter1;

public class Ex28Continue {

	public static void main(String[] args) {
		forTest();
		//while문에서 continue 구문을 사용할때는 조건 변경에 신경을 써야 한다.
		//whileTest();

	}
	
	static void forTest() {
		for(int i= 0; i<10; i++) {
			if(i % 2 !=0) {
				continue;
			}
			System.out.println(i);
		}
	
		
	}
	static void whileTest(){
		int i = 0;
		while(1<10) {
			if(i % 2 != 0 ) {
			
				i++;
				continue;
			}	
			System.out.println(i);
			i++;
		}
	}
	
}
