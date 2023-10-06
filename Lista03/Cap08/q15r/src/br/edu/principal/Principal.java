package br.edu.principal;

import java.util.Scanner;

public class Principal {
	
	public static void ordena(int v[]) {
		int aux;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				if (v[j] > v[j+1]) {
					aux = v[j];
					v[j] = v[j+1];
					v[j+1] = aux;
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		int vet[] = new int [5];
		Scanner sc = new Scanner (System.in);
		for (int x = 0; x < 5; x++) {
			vet[x] = sc.nextInt();
		}
		
		ordena(vet);
		
		for (int x = 0; x < 5; x++) {
			System.out.println(vet[x]);
		}
	}

}
