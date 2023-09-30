package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, soma, qtd, maior, menor, qtd_par;
		double media_par, soma_par, qtd_impar, media, perc;
		qtd = 0;
		qtd_par = 0;
		soma_par = 0;
		qtd_impar = 0;
		soma = 0;
		maior = 0;
		menor = 0;
		num = sc.nextInt();
		while (num != 30000) {
			if (qtd == 0) {
				maior = num;
				menor = num;
			}
			else {
				if (num > maior) {
					maior = num;
				}
				if (num < menor) {
					menor = num;
				}
			}
			soma += num;
			qtd += 1;
			if (num/2 == 0) {
				soma_par += num;
				qtd_par += 1;
			}
			else {
				qtd_impar += 1;
			}
			num = sc.nextInt();
		}
		if (qtd == 0) {
			System.out.print("Nenhum número digitado");
			}
		else {
			System.out.print(soma);
			System.out.print(qtd);
			media = soma / qtd;
			System.out.print(media);
			System.out.print(maior);
			System.out.print(menor);
			if (qtd_par == 0) {
				System.out.print("Nenhum par.");
			}
			else {
				media_par = soma_par / qtd_par;
				System.out.print(media_par);
			}
			perc = qtd_impar * 100 / qtd;
			System.out.print(perc);
		}
	}
}
