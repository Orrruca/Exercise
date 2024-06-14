package exercise002;

public class Calculator {
	
	public double tasu(double num1, double num2) {
		return num1 + num2;
	}
	
	public double hiku(double num1, double num2) {
		return num1 - num2;
	}
	
	public double kakeru(double num1, double num2) {
		return num1 * num2;
	}
	
	public double waru(double num1, double num2) {
		if(num2 != 0) {
			return num1 / num2;
		}else {
			System.out.println("0で割ることができません");
			return -1;
		}
	}

}
