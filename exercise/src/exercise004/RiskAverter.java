package exercise004;

public class RiskAverter implements Investor{
	
	String name;
	int operatingFund = 10000000;
	
	public RiskAverter(String name) {
		this.name = name;
	}
	
	public void introduce() {
		System.out.println("私は" + this.name + "です。リスク大嫌い！");
	}
	
	public void invest(int period) {
		System.out.println(this.name + "は毎年資産が確実に150万円ずつ増加します");
		//毎年確実に150万円ずつ増える
		for(int i = 0; i < period; i++) {
			this.operatingFund += 1500000;
		}
		System.out.println(this.name + "の資産は" + this.operatingFund + "円になりました！");
	}

}
