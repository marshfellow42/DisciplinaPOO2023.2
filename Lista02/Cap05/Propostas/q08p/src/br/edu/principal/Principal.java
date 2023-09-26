package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// 6 pessoas
		
		/**
		 * calcule e mostre:
		 * 
		 * ■■ a quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 kg;
		 * ■■ a média das idades das pessoas com altura inferior a 1,50 m;
		 * ■■ a porcentagem de pessoas com olhos azuis entre todas as pessoas analisadas; e
		 * ■■ a quantidade de pessoas ruivas e que não possuem olhos azuis.
		 */
		
		
		int x = 0;
		int y = 0;
		int soma_idade = 0;
		int z = 0;
		int xy = 0;
		
		for (int i = 1; i <= 6; i++) {
			
			System.out.println("Pessoa n° " + i);
			System.out.println("");
			
			System.out.print("Qual a sua idade: ");
			int id = sc.nextInt();
			
			System.out.print("Qual o seu peso (em kg): ");
			int pe = sc.nextInt();

			System.out.print("Qual a sua altura (em cm): ");
			int al= sc.nextInt();

			System.out.println("""
					A - Azul
					P - Preto
					V - Verde
					C - Castanho
					""");
			System.out.print("Qual a cor dos seus olhos: ");
			String ol = sc.next().toLowerCase();

			System.out.println("""
					P - Preto
					C - Castanho
					L - Loiro
					R - Ruivo
					""");
			System.out.print("Qual a cor do seu cabelo: ");
			String ca = sc.next().toLowerCase();

			if (id > 50 && pe < 60) {
					x++;
			
			if (al < 150) {
				soma_idade = soma_idade + id;
				y++;
			}
			
			if (ol.equals("a")) {
				z++;
			}
			
			if (ca.equals("r") && !ol.equals("a")) {
					xy++;
				}
			}
		}
		
		if (x > 0) {
			System.out.println("A quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 kg, são: " + x);
		}
		else {
			System.out.println("Nenhuma pessoa com mais de 50 anos");
		}
		
		if (y > 0) {
			System.out.println("A média das idades das pessoas com altura inferior a 1,50 m, são: " + soma_idade/y);
		}
		else {
			System.out.println("Nenhuma pessoa com menos de 1.50 m");
		}
		
		if (z > 0) {
			System.out.println("A porcentagem de pessoas com olhos azuis entre todas as pessoas analisadas, são: " + (z/6)*100 + "%");
		}
		else {
			System.out.println("Nenhuma pessoa com olhos azuis");
		}
		
		if (xy > 0) {
			System.out.println("A quantidade de pessoas ruivas e que não possuem olhos azuis, são: " + (xy/6)*100);
		}
		else {
			System.out.println("Nenhuma pessoa ruiva que não possui olhos azuis");
		}
		
		
		
		
	
		
	}

}
