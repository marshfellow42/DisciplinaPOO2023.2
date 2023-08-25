package br.edu.principal;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o seu salário");
		int salario = sc.nextInt();
		System.out.println("Qual era o valor de cada conta");
		int contas = sc.nextInt();
		System.out.println("Quantas multas você atrasou");
		int atraso = sc.nextInt();
		int multa = (((contas * 2)/100) + contas)*atraso;
		int resto = salario - multa;
		
		System.out.println("Esse é o quanto você ainda vai ter após as multas: "+multa);
	}

}
