package exercise006;

import java.util.HashMap;
import java.util.Map;

public class Drink implements Menu{
	
	int price;
	String name;

	Map<String, Integer> drink = new HashMap<String, Integer>();
	
	//今あるドリンクをMapに格納
	public Drink() {
		drink.put("コーラ", 150);
		drink.put("コーヒー", 200);
		drink.put("お茶", 100);
	}
	
	//全てのドリンクを表示する
	public void showMenu() {
		for(String key : drink.keySet()) {
			int value = drink.get(key);
			System.out.print("[" + key + "：" + value + "円]");
		}
		System.out.println();
	}
		
	//ドリンク名から価格を取得
	public int getPrice(String name) {
		return drink.get(name);
	}
	
	//サイドメニューのレジ
	public void cashier() {
		System.out.println("ドリンクを以下の中から入力してください");
		showMenu();
		String drinkName = new java.util.Scanner(System.in).nextLine();
		this.name = drinkName;
		int drinkPrice = getPrice(drinkName);
		this.price = drinkPrice;
		System.out.println(drinkName + "は" + drinkPrice + "円です。");
	}
	
}
