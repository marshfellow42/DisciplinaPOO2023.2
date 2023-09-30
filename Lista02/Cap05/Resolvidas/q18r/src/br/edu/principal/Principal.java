package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num, quad, cubo, raiz;
		num = sc.nextDouble();
		while (num > 0) {
			quad = num * num;
			cubo = num * num * num;
			raiz = Math.sqrt(num);
			System.out.print(quad);
			System.out.print(cubo);
			System.out.print(raiz);
			num = sc.nextDouble();
		}
	}
}
