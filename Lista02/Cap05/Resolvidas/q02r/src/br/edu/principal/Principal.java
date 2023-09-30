package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int n, i, j;
		Scanner sc = new Scanner (System.in);
		double e = 1;
		int fat = 1;
		
		System.out.println("Digite um valor para N: ");
		n = sc.nextInt();
		
		for (i = 0; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				fat = fat * j;
			}
			e = e + 1/fat;
		}
		
		System.out.println("E = " + e);
		
	}

}
