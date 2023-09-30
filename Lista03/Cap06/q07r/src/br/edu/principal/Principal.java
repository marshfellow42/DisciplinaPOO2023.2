package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int i = 1, j, z, aux;
		int vet[] = new int [9];
		Scanner sc = new Scanner (System.in);
		
		while (i <= 8) {
			System.out.print("Digite o " + i + "° número: ");
			aux = sc.nextInt();
			j = 1;
			
			while (j < i && vet[j] < aux) {
				j = j + 1;
			}
			z = i;
			
			while (z >= j+1) {
				vet[z] = vet[z-1];
				z = z - 1;
			}
			
			vet[j] = aux;
			i = i + 1;
		}
		
		System.out.println("Vetores: ");
		for (int a = 1; a <= 8; a++) {
			System.out.println(vet[a]);
		}
	}

}
