package prob02;

public class Goods {
	private String name;
	private int price;
	private int countStock;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCointStock() {
		return countStock;
	}

	public void setCointStock(int cointStock) {
		this.countStock = cointStock;
	}



	public void showInfo() {
		System.out.println( name + "(가격 :" + price+"원)이" +  
				 countStock + "개 입고 되었습니다.");
		
	}

}
