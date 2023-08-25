package br.edu.principal;

public class Principal {
	public static void main (String[] args) {
		int num1 = 6;
		int num2 = 5;
		double r1 = Math.pow(num1, num2);
		double r2 = Math.pow(num2, num1);
		
		if ((r1 % 1) == 0) {
			int value1 = (int)r1;
			System.out.println(value1);
		}
		
		else if ((r1 % 1) != 0) {
			System.out.println(r1);
		}
		
		
		if ((r2 % 1) == 0) {
			int value2 = (int)r2;
			System.out.println(value2);

		}
		
		else if ((r2 % 1) != 0) {
			System.out.println(r2);
		}
		
	}
}
