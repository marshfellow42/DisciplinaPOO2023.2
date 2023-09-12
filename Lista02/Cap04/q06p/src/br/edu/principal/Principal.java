package br.edu.principal;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int esc = sc.nextInt();
		if (esc == 1) {
			double pow = Math.pow(num1, num2);
			System.out.println(pow);
		}
		
		else if (esc == 2) {
			double sqrt1 = Math.sqrt(num1);
			double sqrt2 = Math.sqrt(num2);
			
			System.out.println(sqrt1);
			System.out.println(sqrt2);
		}

		else if (esc == 3) {
			double cube1 = Math.cbrt(num1);
			double cube2 = Math.cbrt(num2);
			
			System.out.println(cube1);
			System.out.println(cube2);
		}
		
		else {
			System.out.println("Invalido");
		}
	}

}
