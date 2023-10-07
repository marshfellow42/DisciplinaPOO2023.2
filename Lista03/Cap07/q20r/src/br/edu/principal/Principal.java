package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int L = 5;
		int C = 4;
		int V = L * C;
		int vet[] = new int [V]; 
		int mat[][] = new int[L][C];
	    int i, j, aux, p = 0;
	    Scanner sc = new Scanner (System.in);	
	    
	    System.out.printf("Digite %d números: \n", V);
	    for (i = 0; i < V; i++) {
	        System.out.printf("\tNúmero %d: : ", i + 1);
	        vet[i] = sc.nextInt();
	    }

	    for (i = 0; i < V; i++) {
	        for (j = i + 1; j < V; j++) {
	            if (vet[i] > vet[j]) {
	                aux = vet[i];
	                vet[i] = vet[j];
	                vet[j] = aux;
	            }
	        }
	    }

	    for (i = 0; i < L; i++) {
	        aux = 0;
	        for (j = 0; j < C; j++) {
	            if (aux == 0) {
	                System.out.printf("%4dº", i + 1);
	            }

	            mat[i][j] = vet[p];
	            System.out.printf("%4d", mat[i][j]);

	            if (aux == C - 1) {
	                System.out.printf("\n");
	            }
	            aux++;
	            p++;
	        }
	    }
	}
}
