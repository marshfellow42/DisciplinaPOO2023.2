package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cod_est, cod_carga, peso_toneladas;
		int peso_quilos, pre_carga, imposto, valor_total;
		cod_est = sc.nextInt();
		peso_toneladas = sc.nextInt();
		cod_carga = sc.nextInt();
		peso_quilos = peso_toneladas * 1000;
		System.out.print(peso_quilos);
		if (cod_carga >= 10 && cod_carga <= 20) {
			pre_carga = 100 * peso_quilos;
		}
		if (cod_carga >= 21 && cod_carga <= 30) {
			pre_carga = 250 * peso_quilos;
		}
		if (cod_carga >= 31 && cod_carga <= 40) {
			pre_carga = 340 * peso_quilos;
		}
		System.out.print(pre_carga);
		if (cod_est == 1) {
			imposto = 35/100 * pre_carga;
		}
		if (cod_est == 2) {
			imposto = 25/100 * pre_carga;
		}
		if (cod_est == 3) {
			imposto = 15/100 * pre_carga;
		}
		if (cod_est == 4) {
			imposto = 5/100 * pre_carga;
		}
		if (cod_est == 5) {
			imposto = 0;
		}
		System.out.print(imposto);
		valor_total = pre_carga + imposto;
		System.out.print(valor_total);
	}

}
