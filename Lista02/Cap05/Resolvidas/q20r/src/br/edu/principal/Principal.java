package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double cod, num_h, sal_b, sal_l, media_m, media_f;
		int cont_m, cont_f;
		String sexo;
		cod = sc.nextDouble();
		cont_m = 0;
		cont_f= 0;
		media_m = 0;
		media_f = 0;
		sal_l = 0;
		while (cod != 99999) {
			sexo = sc.next();
			num_h = sc.nextDouble();
			sal_b = num_h * 30;
			if (sexo == "M") {
				sal_l = sal_b - (sal_b * 10/100);
				media_m += sal_l;
				cont_m += 1;
			}
			if (sexo == "F") {
				sal_l = sal_b - (sal_b * 5/100);
				media_f += sal_l;
				cont_f += 1;
			}
			System.out.print(cod);
			System.out.print(sal_b);
			System.out.print(sal_l);
			cod = sc.nextDouble();
		}
		if (cont_m == 0) {
			System.out.print("Nenhum professor do sexo masculino.");
		}
		else {
			media_m = media_m / cont_m;
			System.out.print(media_m);
		}
		if (cont_f == 0) {
			System.out.print("Nenhuma professora do sexo feminino.");
		}
		else {
			media_f = media_f / cont_f;
			System.out.print(media_f);
		}
	}
}
