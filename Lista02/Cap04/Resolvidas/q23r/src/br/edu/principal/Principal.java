package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int coeficiente = 0;
		int imposto = 0;
		int grat = 0;
		int auxilio = 0;
		
		System.out.print("Qual o seu salário mínimo: ");
		int sal_min = sc.nextInt();
		
		System.out.print("""
				M - Matutino
				V - Verspertino
				N - Noturno 
				""");
		System.out.print("Qual o seu turno?: ");
		String turno = sc.next().toUpperCase();
		
		if (turno.equals("M")) {
			coeficiente = sal_min * 10/100;
		}
		
		else if (turno.equals("V")) {
			coeficiente = sal_min * 15/100;
		}
		
		else if (turno.equals("N")) {
			coeficiente = sal_min * 12/100;
		}
		
		System.out.print("Quantas horas já trabalhou?: ");
		int nht = sc.nextInt();
		
		System.out.println("Coeficiente: " + coeficiente);
		
		int sal_bruto = nht * coeficiente;
		
		System.out.println("Salário Bruto: " + sal_bruto);
		
		System.out.print("""
				O - Operário
				G - Gerente
				""");
		System.out.print("Qual a sua categoria?: ");
		String categoria = sc.next().toUpperCase();
		
		if (categoria.equals("O")) {
			if (sal_bruto >= 300) {
				imposto = sal_bruto * 5/100;
			}
			else if (sal_bruto < 300) {
				imposto = sal_bruto * 3/100;
			}
		}
		
		else if (categoria.equals("G")) {
			if (sal_bruto >= 400) {
				imposto = sal_bruto * 6/100;
			}
			else if (sal_bruto < 400) {
				imposto = sal_bruto * 4/100;
			}
		}
		
		System.out.println("Imposto: " + imposto);
		
		if (turno.equals("N") && nht > 80) {
			grat = 50;
		}
		else if (!turno.equals("N") && nht < 80){
			grat = 30;
		}
		
		System.out.println("Gratificação: " + grat);
		
		if (categoria.equals("O") || coeficiente <= 25) {
			auxilio = sal_bruto * 1/3;
		}
		else if (!categoria.equals("O") || coeficiente > 25) {
			auxilio = sal_bruto * 1/2;
		}
		
		System.out.println("Auxílio: " + auxilio);
		
		int sal_liq = sal_bruto - imposto + grat + auxilio;
		
		System.out.println("Salário líquido: " + sal_liq);
		
		if (sal_liq < 350) {
			System.out.println("Mal remunerado");
		}
		
		else if (sal_liq >= 350 && sal_liq <= 600) {
			System.out.println("Normal");
		}
		
		else if (sal_liq > 600){
			System.out.println("Bem remunerado");
		}
		
	}

}
