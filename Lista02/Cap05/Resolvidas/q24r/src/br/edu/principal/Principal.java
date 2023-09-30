package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op, sal, imp, aum, novo_sal;
		aum = 0;
		imp = 0;
		do {
			System.out.print("Menu de Opções");
			System.out.print("1 - Imposto");
			System.out.print("2 - Novo Salário");
			System.out.print("3 - Classificação");
			System.out.print("4 - Finalizar o programa");
			System.out.print("Digite a opção desejada.");
			op = sc.nextInt();
			if (op > 4 || op < 1) {
				System.out.print("Opção inválida!");
			}
			if (op == 1) {
				sal = sc.nextInt();
				if (sal < 500) {
					imp = sal * 5/100;
				}
				if (sal >= 500 && sal <= 850) {
					imp = sal * 10/100;
				}
				if (sal > 850) {
					imp = sal * 15/100;
				}
				System.out.print(imp);
			}
			if (op == 2) {
				sal = sc.nextInt();
				if (sal > 1500) {
					aum = 25;
				}
				if (sal >= 750 && sal <= 1500) {
					aum = 50;
				}
				if (sal >= 450 && sal < 750) {
					aum = 75;
				}
				if (sal < 450) {
					aum = 100;
				}
				novo_sal = sal + aum;
				System.out.print(novo_sal);
			}
			if (op == 3) {
				sal = sc.nextInt();
				if (sal <= 700) {
					System.out.print("Mal remunerado");
				}
				else {
					System.out.print("Bem remunerado");
				}
			}	
		} while (op == 4);
	}
}
