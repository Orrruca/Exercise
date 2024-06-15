package exercise003;

public class ApexTotalPoint implements TotalPoint{
	
	int totalPoint = 0;
	int aggregatePoint = 0;
	
	KillPoint k = new KillPoint();
	
	public int placementPoint(int placement) {
		if(placement == 1) {return 12;}
		else if(placement == 2){return 9;}
		else if(placement == 3) {return 7;}
		else if(placement == 4) {return 5;}
		else if(placement == 5) {return 4;}
		else if(placement <= 7) {return 3;}
		else if(placement <= 10) {return 2;}
		else if(placement <= 15) {return 1;}
		else {return 0;}
	}
	
	public void totalPoint(int placement, int kills) {
		this.totalPoint = this.placementPoint(placement) + k.killPoint(kills);
		System.out.print(placement + "位" + kills + "キル：" + this.totalPoint + "pt");
		this.aggregatePoint += this.totalPoint;
		System.out.println("　総合：" + this.aggregatePoint + "pt");
	}
	
	

}
