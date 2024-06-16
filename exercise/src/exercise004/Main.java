package exercise004;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Investor[] investor = new Investor[3];
		investor[0] = new RiskAverter("公務員");
		investor[1] = new RiskNeutral("会社員");
		investor[2] = new RiskLover("冒険家");
		
		for(Investor i : investor) {
			i.introduce();
		}
		
		for(Investor i : investor) {
			i.invest(10);
		}

	}

}
