package chapter1;

public class EX16Switch {

	public static void main(String[] args) {
		char grade = ' ';
		int score = 100;
		
		switch(score / 10) {
			case 10 :  //score =100
			case 9 : { // score = 90 <= score <=100
				
			grade = 'A';
			break;
			} 
			case 8: {
				grade = 'B';//score = 80 <= score <=89
				break;
			} 
			case 7: {
				grade = 'C';//score = 70 <= score <=79
				break;
			} 
			case 6: {
				grade = 'D';//score = 60 <= score <=69
				break;
			} 
				default: {
				grade = 'F';
				
			}
				
		}
		System.out.println("학점은 " + grade + "입니다.");
	}
}