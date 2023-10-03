package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int soma, poslivre1 = 1, poslivre2 = 1;
		Scanner sc = new Scanner (System.in);
		
		int vet1[] = new int [11];
		int vet2[] = new int [6];
		int vet_result1[] = new int [11];
		int vet_result2[] = new int [11];
		
		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite o " + i + "° número do 1° vetor: ");
			vet1[i] = sc.nextInt();
		}
		
		System.out.println("");
		
		for (int i = 1; i <= 5; i++) {
			System.out.print("Digite o " + i + "° número do 2° vetor: ");
			vet2[i] = sc.nextInt();
		}
		
		for (int i = 1; i <= 10; i++) {
			soma = vet1[i];
			for (int j = 1; j <= 5; j++) {
				soma = soma + vet2[j];
			}
			if (soma%2 == 0) {
				vet_result1[poslivre1] = soma;
				poslivre1 = poslivre1 + 1;
			}
			else {
				vet_result2[poslivre2] = soma;
				poslivre2 = poslivre2 + 1;
			}
		}
		
		System.out.println("1° vetor resultante:");
		for (int i = 1; i <= (poslivre1 - 1); i++) {
			System.out.println(vet_result1[i]); 
		}
		
		System.out.println("");
		
		System.out.println("2° vetor resultante:");
		for (int i = 1; i <= (poslivre2 - 1); i++) {
			System.out.println(vet_result2[i]); 
		}
	}

}
