package prob01;

public class PrinterTest {

	public static void main(String[] args) {
		Printer printer = new Printer();

//		printer.println(10);
//		printer.println(true);
//		printer.println(5.7);
//		printer.println("홍길동");
//		printer.println(new Point(10,20));
		
		printer.println(10, true);
		printer.println(10, true , 5.7, new Point(10,20));
		
		System.out.println(printer.sum(1));
		printer.sum(1,2);
		printer.sum(1,2,3);
		int[] a = {1,2,3,4};
		
	}
}