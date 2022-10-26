package chapter03;

public class ArrayUtil {

	public static double[] intToDouble(int[] a) {
		double[] result = null;
		
		if(a == null) {
			return result;
		}
		
		result = new double[a.length];
		for(int i= 0;i<a.length;i++) {
			result[i] = a[i];
		}
		return result;
	}

	public static int[] doubletoInt(double[] b) {
		int[] result = null;
		
		if(b == null) {
			return result;
		}
		
		result = new int[b.length];
		for(int i=0; i < b.length; i++) {
			result[i] =  (int) b[i];
		}
		return result;
	}

	public static int[] concat(int[] c, int[] d) {
		int size = 0;
		if(c != null) {
			size += c.length;
		}
		if(d !=null) {
			size += d.length;
		}
		
		int[] result = new int[size];
		
	
		int index = 0;
		for(int v : c) {
			result[index++] = v;
				
		}
		for(int v : d) {
			result[index++] = v;
		}
		return result;

	}
}


