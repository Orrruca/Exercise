package exercise006;

import java.util.HashMap;
import java.util.Map;

public class SideMenu implements Menu{
	
	int price;
	String name;
	
	Map<String, Integer> sideMenu = new HashMap<String, Integer>();
	
	//今あるサイドメニューをMapに格納
	public SideMenu() {
		sideMenu.put("ポテト", 200);
		sideMenu.put("ナゲット", 250);
		sideMenu.put("サラダ", 150);
	}
	
	//全てのサイドメニューを表示する
	public void showMenu() {
		for(String key : sideMenu.keySet()) {
			int value = sideMenu.get(key);
			System.out.print("[" + key + "：" + value + "円]");
		}
		System.out.println();
	}
	
	//サイドメニュー名から価格を取得
	public int getPrice(String name) {
		return sideMenu.get(name);
	}
	
	//サイドメニューのレジ
	public void cashier() {
		System.out.println("サイドメニューを以下の中から入力してください");
		showMenu();
		String sideMenuName = new java.util.Scanner(System.in).nextLine();
		this.name = sideMenuName;
		int sideMenuPrice = getPrice(sideMenuName);
		this.price = sideMenuPrice;
		System.out.println(sideMenuName + "は" + sideMenuPrice + "円です。");
	}

}
