package exercise001;



public class Main {

	public static void main (String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Yusha y = new Yusha("勇者１");
		Goblin g = new Goblin();
		Sword s = new Sword("鉄の剣", 50);
		y.sword = s;
		
		while(y.getHp() != 0 && g.getHp() != 0) {
			System.out.println("ターン" + TurnCount.returnTurnCount());
			y.receiveAction(g);
			if(HpZeroCheck.hpZeroCheck(y, g)) {break;}
			g.attack(y);
			if(HpZeroCheck.hpZeroCheck(y, g)) {break;}
		}

	}	
}
