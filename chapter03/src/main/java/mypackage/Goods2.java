package mypackage;

public class Goods2 {
	public String name; // [모든] 접근이 가능하다
	protected int price; // 같은 패키지 + [자식] 접근*
	int countstock; // default , 같은 패키지
	private int countSold; // 클래스 [내부] 에서만 접근 가능 
	
	void m() {
		countSold = 100;
	}
}
