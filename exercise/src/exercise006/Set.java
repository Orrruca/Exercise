package exercise006;

public class Set {
	
	int totalPrice;
	
	Burger b = new Burger();
	SideMenu sm = new SideMenu();
	Drink d = new Drink();
	
	public void cashier() {
		b.cashier();
		this.totalPrice += b.price;
		sm.cashier();
		this.totalPrice += sm.price;
		d.cashier();
		this.totalPrice += d.price;
		System.out.println(b.name + "/" + sm.name + "/" + d.name + "の合計は" + this.totalPrice + "円です。");
	}
	
}
