package exercise005;

import java.util.HashMap;
import java.util.Map;

public class Burger{
	
	private Map<String, Integer> burgerMenu = new HashMap<String, Integer>();;
	
	//今あるバーガーをMapに格納
	public void burgerInStores() {
		burgerMenu.put("ハンバーガー", 200);
		burgerMenu.put("チーズバーガー", 300);
		burgerMenu.put("てりやきバーガー", 350);
	}
	
	
	//全てのバーガーを表示する
	public void showAllBurger() {
		for(String key : burgerMenu.keySet()) {
			int value = burgerMenu.get(key);
			System.out.print("[" + key + "：" + value + "円]");
		}
		System.out.println();
	}
	
	//バーガーを追加する
	public void addBurger(String name, int price) {
		if(burgerMenu.containsKey(name)) {
			System.out.println(name + "は既に存在します");
		} else {
			burgerMenu.put(name, price);
			System.out.println(name + "を追加しました。現在のバーガーメニュー↓");
			showAllBurger();}
	}
	
	//バーガーを削除する
	public void removeBurger(String name) {
		if(burgerMenu.containsKey(name)) {
			burgerMenu.remove(name);
			System.out.println(name + "を削除しました。現在のバーガーメニュー↓");
			showAllBurger();
		} else {
			System.out.println(name + "は既に存在しません");
		}
	}
	
	//価格変更。値を上書きしている。
	public void priceAdjustment(String name, int price) {
		burgerMenu.put(name, price);
		System.out.println(name + "の価格を" + price + "円に変更しました");
		showAllBurger();
	}
	
	//名前変更。価格を受け取り、一度削除した上で新たな名前と価格を格納する。
	public void changeName(String beforeName, String afterName) {
		int i = burgerMenu.get(beforeName);
		burgerMenu.remove(beforeName);
		burgerMenu.put(afterName, i);
		System.out.println(beforeName + "の名前を" + afterName + "に変更しました");
	}
	

}
