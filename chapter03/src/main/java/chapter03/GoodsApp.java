package chapter03;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods();
		
		camera.setName ("nikon");
		camera.setPrice(-1);
		camera.setCountStock(30);
		camera.setCountSold(50);
		System.out.println(camera);
		
		Goods g1 = new Goods();
		Goods g2 = new Goods();
		Goods g3 = new Goods();
		
		System.out.println(Goods.countOfGoods);
	}

}
