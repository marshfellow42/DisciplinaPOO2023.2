package br.edu.principal;

import java.util.Scanner;

public class Principal {
	
	public static int pares(int v1[], int v2[]) {
		int r, cont = 1;
		
		for (int i = 1; i < 8; i++) {
			r = v1[i]%2;
			if (r == 0) {
				v2[cont] = v1[i];
				cont = cont + 1;
			}
		}
		
		return cont;
	}
	
	public static int impares(int v1[], int v2[]) {
		int r, cont = 1;
		
		for (int i = 1; i < 8; i++) {
			r = v1[i]%2;
			if (r == 1) {
				v2[cont] = v1[i];
				cont = cont + 1;
			}
		}
		
		return cont;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int vet1[] = new int [8];
		int vet2[] = new int [8];
		int vet3[] = new int [8];
		
		for (int i = 0; i < 8; i++) {
			vet1[i] = sc.nextInt();
		}
			
		int cont1 = pares(vet1,vet2);
		
		if (cont1 == 1) {
			System.out.println("NENHUM PAR FOI DIGITADO");
		}
		
		else {
			System.out.println("Números Pares:");
			for (int i = 1; i <= (cont1 - 1); i++) {
				System.out.println(vet2[i]);
			}
		}
		
		System.out.println("");
		
		int cont2 = impares(vet1,vet3);
		
		if (cont2 == 1) {
			System.out.println("NENHUM ÍMPAR FOI DIGITADO");
		}
		
		else {
			System.out.println("Números Ímpares:");
			for (int i = 1; i <= (cont2 - 1); i++) {
				System.out.println(vet3[i]);
			}
		}
		
 	}

}
