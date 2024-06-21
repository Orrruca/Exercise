package exercise007;

public class Defender {
	
	private String name;
	private int age;
	private int height;
	private int marketValue;
	
	public Defender(String name, int age, int height, int marketValue) {
		this.name = name; this.age = age; this.height = height; this.marketValue = marketValue;
	}
	
	public String getName() {return this.name;}
	public int getAge() {return this.age;}
	public int getHeight() {return this.height;}
	public int getMarketValue() {return this.marketValue;}
	
	public String toString() {
		return this.name + "(" + this.age + "/" + this.height + "/" + this.marketValue + ")";
	}
	
	

}
