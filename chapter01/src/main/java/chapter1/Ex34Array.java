package chapter1;

public class Ex34Array {

	public static void main(String[] args) {
		int[] scores = new int[] {90,100,80,70,50,60,30,80};
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		float avg = sum / scores.length;
		System.out.println("평균:" + avg);

	}

}
