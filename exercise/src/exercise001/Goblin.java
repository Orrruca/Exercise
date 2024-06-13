package exercise001;

public class Goblin extends Character{
	
	private final String NAME = "ゴブリン";
	private int hp = 100;
	private final int POWER = 120;
	
	public String getName() {return this.NAME;}
	public int getHp() {return this.hp;}
	public void setHp(int hp) {this.hp = hp;}
	
	public void attack(Yusha y) {
		System.out.println(this.NAME + "は" + y.getName() + "に攻撃した。" );
		y.setHp(Math.max(y.getHp() - this.POWER, 0));
		System.out.println(y.getName() + "に" + this.POWER + "のダメージ！");
		System.out.println(y.getName() + "の体力：" +  y.getHp() + "　" + this.NAME + "の体力：" +  this.hp);
		System.out.println();
		if(y.getHp() == 0) {
			System.out.println(y.getName() + "は力尽きた。"  + this.NAME + "の勝利！");
		}
	}

}
