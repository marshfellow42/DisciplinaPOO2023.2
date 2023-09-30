package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num, fat = 1;
		
		System.out.print("Digite a quantidade de valores que devem ser lidos a seguir: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.print("Digite um número: ");
			num = sc.nextInt();
			
			for (int j = 1; j <= num; j++) {
				fat = fat * j;
			}
			System.out.println("Seu fatorial: " + fat);
			fat = 1;
		}
		

	}

}
