package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m, n, soma, i;
		m = sc.nextInt();
		n = sc.nextInt();
		while (m < n) {
			soma = 0;
			for (i = m; i <= n; i++) {
				soma += i;
			}
			System.out.print(soma);
			m = sc.nextInt();
			n = sc.nextInt();
		}
	}
}
