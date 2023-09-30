package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double valor_inicial, juros, valor_parc, total, valor_juros, num_parc, i;
		System.out.print("Digite o valor inicial da divida");
		valor_inicial = sc.nextDouble();
		juros = 0;
		num_parc = 1;
		total = valor_inicial;
		valor_parc = valor_inicial;
		System.out.print(total);
		System.out.print(juros);
		System.out.print(num_parc);
		System.out.print(valor_parc);
		juros = juros + 10;
		num_parc = num_parc + 2;
		for (i = 1; i <= 4;) {
			valor_juros = valor_inicial * juros / 100;
			total = valor_inicial + valor_juros;
			valor_parc = total / num_parc;
			System.out.print(total);
			System.out.print(valor_juros);
			System.out.print(num_parc);
			System.out.print(valor_parc);
			juros = juros + 5;
			num_parc = num_parc + 3;
		}
	}
}
