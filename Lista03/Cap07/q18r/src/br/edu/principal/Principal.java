package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int lin = 1, col = 1;
		Scanner sc = new Scanner (System.in);
		
		int vet[] = new int [18];
		int mat[][] = new int [3][6];
		
		for (int i = 0; i < 18; i++) {
			vet[i] = sc.nextInt();
		}
		
		for (int i = 0; i < 18; i++) {
			mat[lin][col] = vet[i];
			col = col + 1;
			if (col > 6) {
				lin = lin + 1;
				col = 1;
			}
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.println("Elemento " + i + " -- " + j + mat[i][j]);
			}
		}
	}

}
