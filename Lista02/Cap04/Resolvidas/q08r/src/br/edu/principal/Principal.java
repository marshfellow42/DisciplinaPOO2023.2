package br.edu.principal;

import java.util.*;

public class Principal {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" MENU ");
		
		System.out.println("1 - Somar dois números");
		System.out.println("2 - Raiz quadrada de um número");
		System.out.print("Digite sua opção: ");
		
		int op = sc.nextInt();
		
		if (op == 1) {
			System.out.print("Digite um valor para o primeiro número: ");
			int num1 = sc.nextInt();
			System.out.print("Digite um valor para o segundo número: ");
			int num2 = sc.nextInt();
			int soma = num1 + num2;
			System.out.println("A soma de " +num1+ " e " +num2+ " é " +soma);
		}
		
		if (op == 2) {
			System.out.print("Digite um valor: ");
			int num1 = sc. nextInt();
			double raiz = Math.sqrt(num1);
			System.out.println("A raiz quadrada de "+num1+ " é " +raiz);
		}
		
		if ((op != 1) & (op != 2)) {
			System.out.println("Opção invalida");
		}
	}
}
