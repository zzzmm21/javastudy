package prob5;

public class Prob5 {

	public static void main(String[] args) {
		int n,m,count;

		for(int i = 1; i<100; i++){
			count =0;
			n= i/10;
			m =i%10;
			if(n !=0 && n % 3 ==0) {
				count++;
			}
			if(m !=0 && m % 3 ==0) 
			{
				count++;
			}
			if(count == 1) {
				System.out.println(i +"짝");
			}
			else if(count == 2) {
				System.out.println(i + "짝짝");
			
			}
		
		}
	}
			
}

