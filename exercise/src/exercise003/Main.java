package exercise003;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		ApexTotalPoint atp = new ApexTotalPoint();
		PubgTotalPoint ptp = new PubgTotalPoint();
		
		System.out.println("ゲームタイトルを選んで数字を入力してください");
		System.out.println("１：APEX　２：PUBG");
		int gameTitle = new java.util.Scanner(System.in).nextInt();
		System.out.println("試合数を入力してください");
		int matches = new java.util.Scanner(System.in).nextInt();
		
		switch(gameTitle) {
			case 1:
				for(int i = 0; i < matches; i++) {
					System.out.println("順位を入力してください");
					int placement = new java.util.Scanner(System.in).nextInt();
					System.out.println("キル数を入力してください");
					int kills = new java.util.Scanner(System.in).nextInt();
					System.out.print("第" + (i + 1) + "試合　");
					atp.totalPoint(placement, kills);
				}
				break;
				
			case 2:
				for(int i = 0; i < matches; i++) {
					System.out.println("順位を入力してください");
					int placement = new java.util.Scanner(System.in).nextInt();
					System.out.println("キル数を入力してください");
					int kills = new java.util.Scanner(System.in).nextInt();
					System.out.print("第" + (i + 1) + "試合　");
					ptp.totalPoint(placement, kills);
				}
				break;
		}
		
		
		
		
		
	}

}
