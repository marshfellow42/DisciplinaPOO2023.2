package br.edu.principal;

import java.util.*;

public class Principal {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int cont, cont_n = 1, cont_p = 1;
		
		int num[] = new int [9];
		int pos[] = new int [9];
		int neg[] = new int [9];
		
		for (int i = 1; i < num.length; i++) {
			System.out.print("Digite o " + i + "° valor: ");
			num[i] = sc.nextInt();
			if (num[i] > 0) {
				pos[cont_p] = num[i];
				cont_p++;
				
			}
			else {
				neg[cont_n] = num[i];
				cont_n++;
			}
			
		}
		
		if (cont_n == 1) {
			System.out.println("Vetor de negativos vazio");
		}
		else {
			System.out.println("Vetor de negativos: ");
			for (int i = 1; i <= (cont_n - 1); i++) {
				System.out.println(neg[i]);
			}
		}
		
		if (cont_p == 1) {
			System.out.println("Vetor dos positivos vazio");
		}
		else {
			System.out.println("Vetor de positivos: ");
			for (int i = 1; i <= (cont_p - 1); i++) {
				System.out.println(pos[i]);
			}
		}
		
	}
	
}