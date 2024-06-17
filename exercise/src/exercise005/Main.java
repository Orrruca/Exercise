package exercise005;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Burger b = new Burger();
		
		b.burgerInStores();
		b.showAllBurger();
		b.addBurger("ビッグバーガー", 500);
		b.addBurger("ビッグバーガー", 500);
		b.removeBurger("ハンバーガー");
		b.removeBurger("ハンバーガー");
		b.priceAdjustment("てりやきバーガー", 450);
		b.changeName("チーズバーガー", "極上チーズバーガー");
		b.showAllBurger();
		
	}

}
