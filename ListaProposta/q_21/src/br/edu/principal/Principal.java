package br.edu.principal;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Coloque o tanto de horas que você trabalha: ");
		int sal_hora = sc.nextInt();
		System.out.println("Qual o valor do salário mínimo na sua empresa: ");
		int sal_min = sc.nextInt();
		System.out.println("Qual o número de horas extras que você trabalhou: ");
		int hor_ext = sc.nextInt();
		
		int sal_hora_tab = sal_hora * ((sal_min)/8);
		int sal_hora_ext = hor_ext * ((sal_min/4));
		int sal_bruto = sal_hora * sal_hora_tab;
		int sal_ext = hor_ext * sal_hora_ext;
		int sal_liq = sal_bruto + sal_ext;
		
		System.out.println("Esse é o valor da hora trabalhada: R$"+sal_hora_tab);
		System.out.println("Esse é o valor da hora extra: R$"+sal_hora_ext);
		System.out.println("Salário bruto: R$"+sal_bruto);
		System.out.println("O quanto deve receber pelas horas extras: R$"+sal_ext);
		System.out.println("Seu salário líquido: R$"+sal_liq);
		
	}

}
