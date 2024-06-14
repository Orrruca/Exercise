package exercise002;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
		Scanner scanner = new Scanner(System.in);
		Calculator calc = new Calculator();
		
		System.out.println("一つ目の数字を入力してください");
		double num1 = scanner.nextDouble();
		System.out.println("二つ目の数字を入力してください");
		double num2 = scanner.nextDouble();
		System.out.println("演算子（+-*/）を入力してください");
		char ennzann = scanner.next().charAt(0);
		
		double result;
		switch(ennzann) {
			case '+':
				result = calc.tasu(num1, num2);
				System.out.println(num1 + "と" + num2 + "の和は" + result + "です");
				break;
			case '-':
				result = calc.hiku(num1, num2);
				System.out.println(num1 + "と" + num2 + "の差は" + result + "です");
				break;
			case '*':
				result = calc.kakeru(num1, num2);
				System.out.println(num1 + "と" + num2 + "の積は" + result + "です");
				break;
			case '/':
				result = calc.waru(num1, num2);
				if(result != -1) {
					System.out.println(num1 + "と" + num2 + "の商は" + result + "です");
				}
				break;
			default:
				System.out.println("演算子が誤っています");
		}
		
		
	}

}
