package prob06;

public class Arith {
	private int add;
	private int sub;
	private int div;
	private int mul;
	
	
	public Arith(int add, int sub , int div , int mul) {
		this.add = add;
		this.sub = sub;
		this.div = div;
		this.mul = mul;
		
	}
	
	public int getAdd() {
		return add;
	}

	public void setAdd(int add) {
		this.add = add;
	}

	public int getSub() {
		return sub;
	}

	public void setSub(int sub) {
		this.sub = sub;
	}

	public int getDiv() {
		return div;
	}

	public void setDiv(int div) {
		this.div = div;
	}

	public int getMul() {
		return mul;
	}

	public void setMul(int mul) {
		this.mul = mul;
	}

	public int add (int a , int b) {
		return add = a +b;
		
	}

	public int sub(int a , int b) {
		return sub = a-b;
	}
	
	public int mul(int a , int b) {
		return mul = a*b;
	}

	public int div(int a , int b) {
		return div = a/b;
	}

}
