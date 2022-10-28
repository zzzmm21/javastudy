package prob03;

public class CurrencyConverter {
	private static double setRate;
	private static double dollor;
	private static double krw;
	public static double toDollar(int i) {
		dollor = i/ setRate;
		return i;
	}
	public static double toKRW(int i) {
		dollor = i/ setRate;
		return i;

	}
	public static void setRate(double d) {
		d = 1433.0;
		
	}
	
	

}
