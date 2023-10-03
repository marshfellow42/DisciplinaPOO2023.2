package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int codigo, valor, soma, op;
		boolean achou;
		Scanner sc = new Scanner (System.in);
		
		int conta[] = new int [10];
		int saldo[] = new int [10];
		
		for (int i = 1; i <= 10; i++) {
			achou = false;
			do {
				conta[i] = sc.nextInt();
				for (int j = 1; j <= (i-1); j++) {
					if (conta[i] == conta[j]) {
						achou = true;
					}
				}
			}
			while (achou == false);
			saldo[i] = sc.nextInt();
		}
		
		do {
			op = sc.nextInt();
			achou = false;
			if (op == 1) {
				codigo = sc.nextInt();
				valor = sc.nextInt();
				for (int i = 1; i <= 10; i++) {
					if (codigo == conta[i]) {
						saldo[i] = saldo[i] + valor;
						achou = true;
						System.out.println("Depósito efetuado");
					}
				}
				if (achou == false) {
					System.out.println("Conta não cadastrada");
				}
			}
			if (op == 2) {
				codigo = sc.nextInt();
				valor = sc.nextInt();
				for (int i = 1; i <= 10; i++) {
					if (codigo == conta[i]) {
						if (saldo[i] < valor) {
							System.out.println("Saldo insuficiente");
						}
					}
					else {
						saldo[i] = saldo[i] - valor;
						System.out.println("Saque efetuado");
					}
					achou = true;
				}
				if (achou == false) {
					System.out.println("Conta não cadastrada");
				}
			}
			if (op == 3) {
				soma = 0;
				for (int i = 1; i <= 10; i++) {
					soma = soma + saldo[i];
				}
				System.out.println(soma);
			}
			if (op < 1 || op > 4) {
				System.out.println("Opção inválida");
			}
		}
		while (op == 4);
	}

}
