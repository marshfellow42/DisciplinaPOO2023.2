package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cod_prod, peso_quilos;
		int cod_país, peso_gramas, pre_total;
		int imposto, valor_total, pre_grama;
		cod_prod = sc.nextInt();
		peso_quilos = sc.nextInt();
		cod_país = sc.nextInt();
		peso_gramas = peso_quilos * 1000;
		System.out.print(peso_gramas);
		if ((cod_prod >= 1) && (cod_prod <= 4));
			pre_grama = 10;
		if ((cod_prod >= 5) && (cod_prod <= 7));
			pre_grama = 25;
		if ((cod_prod >= 8) && (cod_prod <= 10));
			pre_grama = 35;
		pre_total = peso_gramas * pre_grama;
		System.out.print(pre_total);
		if (cod_país == 1) {
			imposto = 0;
		}
		if (cod_país == 2) {
			imposto = (pre_total * 15/100);
		}
		if (cod_país == 3) {
			imposto = (pre_total * 25/100);
		}
		System.out.print(imposto);
		valor_total = pretotal + imposto;
		System.out.print(valor_total);


	}

}
