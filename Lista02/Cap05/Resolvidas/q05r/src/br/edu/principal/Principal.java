package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double fim, i, j, x, expoente, num_termos;
		double den, denominador, fat;
		fat = 0;
		i = 0;
		fim = 0;
		den = 0;
		num_termos = sc.nextDouble();
		x = sc.nextDouble();
		double s = 0;
		denominador = 1;
		for (j = 1; j <= fim;) {
			fat = fat * j;
		}
		expoente = i + 1;
		if (expoente/2 == 0) {
			s = s - Math.pow(x, expoente)/fat;
			s = s + Math.pow(x, expoente)/fat;
			if (denominador == 4) {
				den = -1;
			}
			if (denominador == 1) {
				den = 1;
			}
			if (den == 1) {
				denominador = denominador +1;
			}
			else {
				denominador = denominador - 1;
			}
			
		}
		System.out.print(s);
	}

}
