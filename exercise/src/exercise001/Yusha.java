package exercise001;

public class Yusha extends Character{
	
	private final String NAME;
	private int hp = 500;
	private final int MAX_HP = 500;
	private final int POWER = 30;
	Sword sword;
	
	public Yusha(String name) {
		this.NAME = name;
	}
	
	public String getName() {return this.NAME;}
	public int getHp() {return this.hp;}
	public void setHp(int hp) {this.hp = hp;}
	
	public void receiveAction(Goblin g) {
		System.out.println("１か２か３を入力。＜１：通常攻撃＞＜２：剣で攻撃＞＜３：回復＞");
		int input = new java.util.Scanner(System.in).nextInt();
		switch(input) {
			case 1:
				nomalAttack(g);
				break;
			case 2:
				swordAttack(g);
				break;
			case 3:
				heal(g);
				break;
		}
	}
	
	public void nomalAttack(Goblin g) {
		System.out.println(this.NAME + "は" + g.getName() + "に通常攻撃した。" );
		g.setHp(Math.max(g.getHp() - this.POWER, 0));
		System.out.println(g.getName() + "に" + this.POWER + "のダメージ！");
		System.out.println(this.NAME + "の体力：" +  this.hp + "　" + g.getName() + "の体力：" +  g.getHp());
		System.out.println();
		if(g.getHp() == 0) {
			System.out.println(g.getName() + "は力尽きた。"  + this.NAME + "の勝利！");
		}
	}
	
	public void swordAttack(Goblin g) {
		System.out.println(this.NAME + "は" + g.getName() + "に剣で攻撃した。" );
		g.setHp(Math.max(g.getHp() - sword.dmg, 0));
		System.out.println(g.getName() + "に" + sword.dmg + "のダメージ！");
		System.out.println(this.NAME + "の体力：" +  this.hp + "　" + g.getName() + "の体力：" +  g.getHp());
		System.out.println();
		if(g.getHp() == 0) {
			System.out.println(g.getName() + "は力尽きた。"  + this.NAME + "の勝利！");
		}
	}
	
	public void heal(Goblin g) {
		System.out.println(this.NAME + "は回復薬を使用した！");
		int recoverActual = Math.min(100, MAX_HP - this.hp);
		this.setHp(this.getHp() + recoverActual);
		System.out.println(this.NAME + "の体力が" + recoverActual + "回復した！");
		System.out.println(this.NAME + "の体力：" +  this.hp + "　" + g.getName() + "の体力：" +  g.getHp());
		System.out.println();
	}
	
	

}
