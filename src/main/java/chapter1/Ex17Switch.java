package chapter1;

public class Ex17Switch {

	public static void main(String[] args) {
			char grade = 'D';
			
			switch(grade) {
			case'A':
			case'B': {
				System.out.println("참 잘했어요");
				break;
			}
			case 'C':
			case 'D':{
				System.out.println("좀 더 노력하세요");
				break;
			}
			case 'F':{
				System.out.println("다음 학기에 수강 하세요");
				break;
			}
		}
	}

}
