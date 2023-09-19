package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sal, novo_sal, boni, aux = 0;
		
		sal = sc.nextDouble();
		if (sal <= 500) {
			boni = sal * 5/100;
		}
		else if(sal <= 600) {
			boni = sal * 5/100;
			aux = 150;
		}
		else if (sal <= 1200) {
			boni = sal * 12/100;
			if (sal > 600) {
				aux = 100;
			}
		}
		else {
			boni = 0;
		}
		
		
		novo_sal = (sal + boni + aux);
		System.out.println(novo_sal);
	}
}
