package br.edu.principal;

import java.util.Scanner;

public class Principal {
	
	public static void gera_vetor(int m[][], int v[]) {
		int k = 0;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				v[k] = m[i][j]; 
				k = k + 1;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int mat[][] = new int [3][4];
		int vet[] = new int [12];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		gera_vetor(mat,vet);
		
		for (int i = 0; i < 12; i++) {
			System.out.println(vet[i]);
		}
	}

}
