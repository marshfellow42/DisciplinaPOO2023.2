package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sal_carlos, sal_joao, meses;
		sal_carlos = sc.nextInt();
		sal_joao = sal_carlos / 3;
		meses = 0;
		while (sal_joao < sal_carlos) {
			sal_carlos = sal_carlos + (sal_carlos * 2/100);
			sal_joao = sal_joao + (sal_joao * 5/100);
			meses = meses + 1;
		}
		System.out.print(meses);
	}
}
