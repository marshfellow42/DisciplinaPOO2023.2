package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sal, qtd, tipo, valor_kw, gasto, acresc, total, tot_geral, qtd_cons;
		tot_geral = 0;
		qtd_cons = 0;
		acresc = 0;
		sal = sc.nextInt();
		qtd = sc.nextInt();
		valor_kw = sal / 8;
		while (qtd != 0) {
			gasto = qtd * valor_kw;
			tipo = sc.nextInt();
			if (tipo == 1) {
				acresc = gasto * 5 / 100;
			}
			if (tipo == 2) {
				acresc = gasto * 10 / 100;
			}
			if (tipo == 3) {
				acresc = gasto * 15 / 100;
			}
			total = gasto + acresc;
			tot_geral += total;
			if (total >= 500 && total <= 1000) {
				qtd_cons += 1;
			}
			System.out.print(gasto);
			System.out.print(acresc);
			System.out.print(total);
			qtd = sc.nextInt();
		}
		System.out.print(tot_geral);
		System.out.print(qtd_cons);
	}
}
