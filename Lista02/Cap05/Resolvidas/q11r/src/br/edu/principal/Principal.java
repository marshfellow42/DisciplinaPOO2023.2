package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, num, qtde;
		num = sc.nextInt();
		qtde = 0;
		for (i = 1; i <= num; i++) {
			if ((num/i) == 0) {
				qtde = qtde + 1;
			}
		}
		if (qtde > 2) {
			System.out.print("Número não primo");
		}
		else {
			System.out.print("Número Primo");
		}
	}
}
