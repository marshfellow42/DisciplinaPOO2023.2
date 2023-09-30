package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade, tot_f, tot_m, soma1, cont_m1, cont_m2, tot, cont_f1, menor_idade;
		double media_idade, perc;
		String sexo, exp;
		tot = 0;
		tot_f = 0;
		tot_m = 0;
		soma1 = 0;
		cont_m1 = 0;
		cont_m2 = 0;
		cont_f1 = 0;
		media_idade = 0;
		menor_idade = 0;
		idade = sc.nextInt();
		while (idade != 0) {
			sexo = sc.next();
			exp = sc.next();
			if (sexo == "F" && exp == "S") {
				if (tot == 0) {
					menor_idade = idade;
					tot = 1;
				}
				else if (idade < menor_idade) {
					menor_idade = idade;
				}
			}
			if (sexo == "M") {
				tot_m += 1;
			}
			if (sexo == "F") {
				tot_f += 1;
			}
			if (sexo == "F" && idade < 21 && exp == "S") {
				cont_f1 += 1;
			}
			if (sexo == "M" && idade > 45) {
				cont_m1 += 1;
			}
			if (sexo == "M" && exp == "S") {
				soma1 = soma1 + idade;
				cont_m2 += 1;
			}
			idade = sc.nextInt();
		}
		System.out.print(tot_f);
		System.out.print(tot_m);
		if (cont_m2 == 0) {
			System.out.print(media_idade);
		}
		if (tot_m == 0) {
			System.out.print("Nenhum homem");
		}
		else {
			perc = cont_m1 * 100 / tot_m;
			System.out.print(perc);
		}
		System.out.print(cont_f1);
		System.out.print(menor_idade);
	}
}
