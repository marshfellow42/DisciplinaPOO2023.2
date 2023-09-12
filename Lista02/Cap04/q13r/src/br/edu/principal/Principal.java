package br.edu.principal;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op, sal, imp, aum, novo_sal
		
		System.out.println("MENU DE OPÇÕES");
		System.out.println("NOVO SALÁRIO");
		System.out.println("CLASSIFICAÇÃO");
		System.out.println("DIGITE A OPÇÃO DESEJADA");
		op = sc.nextInt();
		
		if (op == 1) {
			sal = sc.nextInt();
			if (sal < 500)
				imp = (sal * 5/100);
			if (sal >= 500)
				imp = (sal * 10/100);
			if (sal > 500)
				imp = (sal * 15/100);
		}
		
		if (op == 2) {
			sal = sc.nextInt();
			if (sal > 1500)
				aum = 25;
			if (sal >= 750 && sal <= 1500)
				aum = 50;
			if (sal >= 450 && sal <= 750)
				aum = 75;
			if (sal < 450)
				aum = 100;
			novo_sal = sal + aum
			System.out.println(novo_sal);
		}
		
		if (op == 3) {
			sal = sc.nextInt();
			if (sal <= 700)
				System.out.println("Mal Remunerado");
			if (sal > 700)
				System.out.println("Bem Remunerado");
		}
		
		if (op < 1 || op > 3)
			System.out.println("Opção Inválida");
	}
}
