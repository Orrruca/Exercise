package exercise006;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Menu[] menu = new Menu[3];
		menu[0] = new Burger();
		menu[1] = new SideMenu();
		menu[2] = new Drink();
		Set s = new Set();
		
		System.out.println("購入する商品を数字で入力してください。１：バーガー　２：サイドメニュー　３：ドリンク　４：セット");
		int input = new java.util.Scanner(System.in).nextInt();
		
		if(input == 4) {
			s.cashier();
			System.out.println("お買い上げありがとうございます！");
		}else {
			for(int i = 0; i < menu.length; i++) {
				if(i == input - 1) {
					menu[i].cashier();
					System.out.println("お買い上げありがとうございます！");
				}
			}
		}
		
		
	}

}
