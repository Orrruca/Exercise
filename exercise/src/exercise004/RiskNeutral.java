package exercise004;

import java.util.Random;

public class RiskNeutral implements Investor{
	
	String name;
	long operatingFund = 10000000;
	
	public RiskNeutral(String name) {
		this.name = name;
	}
	
	public void introduce() {
		System.out.println("私は" + this.name + "です。リスク中立的！");
	}
	
	public void invest(int period) {
		System.out.println(this.name + "は毎年資産が0.9～1.3倍（ランダム）になります");
		//毎年0.9～1.3倍（ランダム）になる
		Random rand = new Random();
		for(int i = 0; i < period; i++) {
			int num = rand.nextInt(5);
			switch(num) {
				case 0:
					this.operatingFund = Math.round(this.operatingFund * 0.9);
					break;
				case 1:
					this.operatingFund = Math.round(this.operatingFund * 1.0);
					break;
				case 2:
					this.operatingFund = Math.round(this.operatingFund * 1.1);
					break;
				case 3:
					this.operatingFund = Math.round(this.operatingFund * 1.2);
					break;
				case 4:
					this.operatingFund = Math.round(this.operatingFund * 1.3);
					break;
			}
		}
		System.out.println(this.name + "の資産は" + this.operatingFund + "円になりました！");
	}


}
