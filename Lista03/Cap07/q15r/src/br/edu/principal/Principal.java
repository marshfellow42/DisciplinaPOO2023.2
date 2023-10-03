package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int maior, menor, mult, soma, qtde;
		Scanner sc = new Scanner (System.in);
		
		int vet1[] = new int [5];
		int vet2[] = new int [10];
		int mat[][] = new int [4][3];
		int mat_result[][] = new int [4][3];
		
		
		for (int i = 0; i < 5; i++) {
			vet1[i] = sc.nextInt();
		}
		
		for (int i = 0; i < 10; i++) {
			vet2[i] = sc.nextInt();
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j < 3; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		maior = vet1[1];
		
		for (int i = 0; i < 5; i++) {
			if (vet1[i] > maior) {
				maior = vet1[i];
			}
		}
		
		menor = vet2[1];
		
		for (int i = 0; i < 10; i++) {
			if (vet2[i] < menor) {
				menor = vet2[i];
			}
		}
		
		mult = maior * menor;
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				mat_result[i][j] = mat[i][j] + mult;
			}
		}
		
		System.out.println("Matriz resultante");
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(mat_result[i][j]);
			}
		}
		
		for (int i = 0; i < 4; i++) {
			soma = 0;
			for (int j = 0; j < 3; j++) {
				if (mat_result[i][j]%2==0) {
					soma = soma + mat_result[i][j];
				}
			}
			System.out.println("Soma dos elementos pares da linha " + i + " da matriz resultante  = " + soma);
		}
		
		for (int j = 0; j < 3; j++) {
			qtde = 0;
			for (int i = 0; i < 4; i++) {
				if (mat_result[i][j] > 1 && mat_result[i][j] < 5) {
					qtde = qtde + 1;
				}
			}
			System.out.println("Total de números entre 1 e 5 na coluna " + j + " da matriz resultante " + qtde);
		}
	}

}
