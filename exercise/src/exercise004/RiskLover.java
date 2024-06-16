package exercise004;

import java.util.Random;

public class RiskLover implements Investor{
	
	String name;
	int operatingFund = 10000000;
	
	public RiskLover(String name) {
		this.name = name;
	}
	
	public void introduce() {
		System.out.println("私は" + this.name + "です。リスク大好き！");
	}
	
	public void invest(int period) {
		System.out.println(this.name + "は毎年資産が2分の1の確率で0.5倍か2倍になります");
		//毎年2分の1の確率で0.5倍か2倍になる
		Random rand = new Random();
		for(int i = 0; i < period; i++) {
			int num = rand.nextInt(2);
			if(num == 0) {this.operatingFund = this.operatingFund / 2;}
			else {this.operatingFund = this.operatingFund * 2;}
		}
		System.out.println(this.name + "の資産は" + this.operatingFund + "円になりました！");
	}


}
