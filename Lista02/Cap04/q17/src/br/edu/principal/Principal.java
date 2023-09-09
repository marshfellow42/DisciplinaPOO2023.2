package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b, c, delta, x1, x2;
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		if (a == 0) {
			System.out.println("Estes valores não formam uma equação de segundo grau");
		}
		else {
			delta = ((b * b) - (4 * a * c));
			if (delta < 0)
				System.out.println("Não existe raiz real");
			if (delta == 0)
				System.out.println("Existe uma raiz real");
				x1 = ((-b) / (2 * a));
				System.out.print(x1);
			if (delta > 0) {
				System.out.println("Existem duas raízes reais");
				x1 = ((-b + java.lang.Math.sqrt(delta) / (2 * a)));
				x2 = ((-b - java.lang.Math.sqrt(delta) / (2 * a)));
				System.out.print(x1);
				System.out.print(x2);
			}
		}
	}
}
