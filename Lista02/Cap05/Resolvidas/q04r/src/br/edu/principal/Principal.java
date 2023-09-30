package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont, cod, num_vei, num_acid;
		int maior, cid_maior, menor, cid_menor;
		int media_vei, soma_vei, media_acid;
		int soma_acid, cont_acid;
		maior = 0;
		cid_maior = 0;
		menor = 0;
		cid_menor = 0;
		soma_vei = 0;
		soma_acid = 0;
		cont_acid = 0;
		for (cont = 1; cont <= 5; cont++);
			cod = sc.nextInt();
			num_vei = sc.nextInt();
			num_acid = sc.nextInt();
			if (cont == 1) {
				maior = num_acid;
				cid_maior = cod;
				menor = num_acid;
				cid_menor = cod;	
	}
			else 
				if (num_acid > maior) {
				maior = num_acid;
				cid_maior = cod;
			}
				if (num_acid < menor) {
					menor = num_acid;
					cid_menor = cod;
				}
			soma_vei = soma_vei + num_vei;
			if (num_vei < 2000) {
				soma_acid = soma_acid + num_acid;
				cont_acid = cont_acid +1;
			}
			System.out.print(maior);
			System.out.print(cid_maior);
			System.out.print(menor);
			System.out.print(cid_menor);
			media_vei = soma_vei/5;
			System.out.print(media_vei);
			if (cont_acid == 0) {
				System.out.println("Não foi digitada nenhuma cidade com menos de 2000 veículos");
			}
			else {
				media_acid = soma_acid/cont_acid;
				System.out.print(media_acid);
			}
	}
} 
