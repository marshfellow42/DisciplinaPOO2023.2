package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double valor_adic = 0;
		int imposto = 0;
		int desconto = 0;
		
		System.out.print("""
				A - Alimentação
				L - Limpeza
				V - Vestuário
				""");
		System.out.print("Qual o tipo do seu produto?: ");
		String tipo = sc.next().toUpperCase();
		
		System.out.println("");
		
		System.out.print("Qual o preço do seu produto?: ");
		int pre = sc.nextInt();
		
		System.out.println("");
		
		System.out.print("""
				N - Não precisa
				S - Precisa
				""");
		System.out.print("Seu produto precisa de refrigeração?: ");
		String refrig = sc.next().toUpperCase();
		
		System.out.println("");
		
		if (refrig.equals("N")) {
			if (tipo.equals("A")) {
				if (pre < 15) {
					valor_adic = 2;
				}
				if (pre >= 15) {
					valor_adic = 5;
				}
			}
			
			if (tipo.equals("L")) {
				if (pre < 10) {
					valor_adic = 1.50;
				}
				if (pre >= 10) {
					valor_adic = 2.50;
				}
			}
			
			if (tipo.equals("V")) {
				if (pre < 30) {
					valor_adic = 3;
				}
				if (pre >= 30) {
					valor_adic = 2.5;
				}
			}
		}
		
		if (refrig.equals("S")) {
			if (tipo.equals("A")) {
				valor_adic = 8;
			}
			if (tipo.equals("L")) {
				valor_adic = 0;
			}
			if (tipo.equals("V")) {
				valor_adic = 0;
			}
		}
		
		System.out.println("Valor adicional: " + valor_adic + " reais");
		
		if (pre < 25) {
			imposto = pre * 5/100;
		}
		if (pre >= 25) {
			imposto = pre * 8/100;
		}
		
		System.out.println("Imposto: " + imposto + " reais");
		
		int pre_custo = pre + imposto;
		
		System.out.println("Custo do preço: " + pre_custo + " reais");
		
		if (!tipo.equals("A") && !refrig.equals("S")) {
			desconto = pre_custo * 3/10;
			System.out.println("Desconto: " + desconto + " reais");
		}
		else {
			desconto = 0;
			System.out.println("Desconto: " + desconto);
		}
		
		double novo_pre = pre_custo + valor_adic - desconto;
		
		System.out.println("Novo preço: " + novo_pre + " reais");
		
		System.out.print("Tipo de Preço: ");
		if (novo_pre <= 50) {
			System.out.println("Barato");
		}
		else if (novo_pre < 100) {
			System.out.println("Normal");
		}
		else if (novo_pre >= 100) {
			System.out.println("Caro");
		}
	}

}
