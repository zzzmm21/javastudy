package chapter1;

public class Ex08ArithmaticOperator {

	public static void main(String[] args) {
		final int TIME = 20000; // 500초
		
		int hours =   TIME / 60 / 60;
		int minutes = TIME / 60 % 60;
		int seconds = TIME % 60;
		
		
		
		System.out.println(TIME + "초는" + hours +"시간"  + minutes + "분" + seconds + "초 입니다");
	}

}
