package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double i, num_cri, meses, porc_f, porc_m, tot_f, tot_m, tot_24, porc_24;
		String sexo;
		System.out.print("Digite o número de crianças nascidas no período ");
		num_cri = sc.nextDouble();
		tot_m = 0;
		tot_f = 0;
		tot_24 = 0;
		for (i = 1; i <= num_cri;) {
			System.out.printf("Digite o sexo (M ou F) da ", i, "ª criança");
			sexo = sc.next();
			System.out.printf("Digite o tempo de vida da ", i, "ª criança");
			meses = sc.nextDouble();
			if (sexo == "M") {
				tot_m = tot_m + 1;
			}
			if (sexo == "F") {
				tot_f = tot_f + 1;
			}
			if (meses <= 24) {
				tot_24 = tot_24 + 1;
			}
		}
		if (num_cri == 0) {
			System.out.print("Nenhuma cirança digitada");
		}
		else {
			porc_m = tot_m * 100 / num_cri;
			porc_f = tot_f * 100 / num_cri;
			porc_24 = tot_24 * 100 / num_cri;
			System.out.printf("Percentual de crianças do sexo feminino mortas ", porc_f);
			System.out.printf("Percentual de crianças do sexo masculino mortas ", porc_m);
			System.out.printf("Percentual de crianças com 24 meses ou menos mortas no período ", porc_24);
		}
	}
}
