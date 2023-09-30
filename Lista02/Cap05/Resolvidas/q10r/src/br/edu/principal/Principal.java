package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont_time, cont_jog, idade;
		double peso, alt, qtde, media_idade;
		double media_altura, porc, tot80;
		qtde = 0;
		tot80 = 0;
		media_altura = 0;
		for (cont_time = 1; cont_time <= 5;) {
			media_idade = 0;
			for (cont_jog = 1; cont_jog <= 11;) {
				idade = sc.nextInt();
				peso = sc.nextDouble();
				alt = sc.nextDouble();
				if (idade < 18) {
					qtde = qtde + 1;
					media_idade = media_idade + idade;
					media_altura = media_altura + alt;
					if (peso > 80) {
						tot80 = tot80 + 1;
					}
				}
			}
			media_idade = media_idade/11;
			System.out.print(media_idade);
		}
		System.out.print(qtde);
		media_altura = media_altura/55;
		System.out.print(media_altura);
		porc = tot80 * 100/55;
		System.out.print(porc);
	}
}
