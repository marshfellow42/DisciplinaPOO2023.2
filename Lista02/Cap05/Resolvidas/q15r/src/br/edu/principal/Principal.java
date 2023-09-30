package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, preco, custo_est, imp, preco_final, adicional, maior_p, menor_p, tot_imp, qtd_b, qtd_n, qtd_c;
		String refri, categ;
		adicional = 0;
		tot_imp = 0;
		qtd_b = 0;
		qtd_n = 0;
		qtd_c = 0;
		maior_p = 0;
		menor_p = 0;
		custo_est = 0;
		for (i = 1; i <= 12;) {
			preco = sc.nextInt();
			refri = sc.next();
			categ = sc.next();
			if (preco <= 20) {
				if (categ == "A") {
					custo_est = 2;
				}
				if (categ == "L") {
					custo_est = 3;
				}
				if (categ == "V") {
					custo_est = 4;
				}
			}
			if (preco > 20 && preco <= 50) {
				if (refri == "S") {
					custo_est = 6;
				}
				else {
					custo_est = 0;
				}
			}
			if (preco > 50) {
				if (refri == "S") {
					if (categ == "A") {
						custo_est = 5;
					}
					if (categ == "L") {
						custo_est = 2;
					}
					if (categ == "V") {
						custo_est = 4;
					}
				}
				else {
					if (categ == "A" || categ == "V") {
						custo_est = 0;
					}
					if (categ == "L") {
						custo_est = 1;
					}
				}
			}
			if (categ != "A" && refri != "S") {
				imp = preco * 2 /100;
			}
			else {
				imp = preco* 4/100;
			}
			preco_final = preco + custo_est + imp;
			System.out.print(custo_est);
			System.out.print(imp);
			System.out.print(preco_final);
			if (preco_final <= 20) {
				qtd_b = qtd_b + 1;
				System.out.print("Classificação barato");
			}
			if (preco_final > 20 && preco_final <= 100) {
				qtd_n = qtd_n + 1;
				System.out.print("Classificação normal");
			}
			if (preco_final > 100) {
				qtd_c = qtd_c + 1;
				System.out.print("Classificação caro");
			}
			adicional = adicional + custo_est + imp;
			tot_imp = imp;
			if (i == 1) {
				maior_p = preco_final;
				menor_p = preco_final;
			}
			else {
				if (preco_final > maior_p) {
					maior_p = preco_final;
				}
				if (preco_final < menor_p) {
					menor_p = preco_final;
				}
			}	
		}
		adicional = adicional / 12;
		System.out.print(adicional);
		System.out.print(maior_p);
		System.out.print(menor_p);
		System.out.print(tot_imp);
		System.out.print(qtd_b);
		System.out.print(qtd_n);
		System.out.print(qtd_c);
	}
}
