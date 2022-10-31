package prob03;

public class CurrencyConverter {
	private static double setRate;
	private static double dollor;
	private static double krw;
	
	public CurrencyConverter(double setRate, double dollar , double krw) {
		this.dollor = dollor;
		this.krw = krw;
		this.setRate = setRate;
	}
	public static double toDollar(int i) {
		dollor =  setRate;
		return i;
	}
	public static double toKRW(int i) {
		dollor /= krw;
		return i;
		
		

	}
	public static double getSetRate() {
		return setRate;
	}
	public static void setSetRate(double setRate) {
		CurrencyConverter.setRate = setRate;
	}
	public static double getDollor() {
		return dollor;
	}
	public static void setDollor(double dollor) {
		CurrencyConverter.dollor = dollor;
	}
	public static double getKrw() {
		return krw;
	}
	public static void setRate(double d) {
		d = 1433.0;
		// TODO Auto-generated method stub
		
	}
	
	
	

}
