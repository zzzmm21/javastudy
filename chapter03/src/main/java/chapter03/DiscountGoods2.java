package chapter03;

import mypackage.Goods2;

public class DiscountGoods2 extends Goods2 {
	private float discountRate = 0.3f;
	
	public int getDiscountPrice(){
		// protected는 자식에서 접글할 수 있다(price)
		return (int)(discountRate * price);
	}

}
