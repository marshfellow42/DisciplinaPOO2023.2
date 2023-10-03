package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int tot_arm, maior_e = 0, menor_e = 0, custo_p, custo_a, ind_a = 0;
		int prod[][] = new int [6][3];
		Scanner sc = new Scanner (System.in);
		
		for(int i = 1; i < 4; i++) {
			for(int j = 1; j < 3;j++) {
				prod[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 1; i < 3; i++) {
			prod[5][i] = sc.nextInt();
		}
		
		for(int i = 1; i < 4; i++) {
			tot_arm = 0;
			for(int j = 1; j < 3;j++) {
				tot_arm = tot_arm + prod[i][j];
			}
			System.out.println("O total de itens no armazém " + i + " = " + tot_arm);
			if  (i == 1)  {
				menor_e = tot_arm;
				ind_a = i;
				ind_a = i;
			}
			else {
				if (tot_arm < menor_e) {
					menor_e = tot_arm;
					ind_a = i;
				}
			}
		}
		
		System.out.println("Armazém com menor estoque " + ind_a);
		for(int i = 1; i < 4; i++) {
			if (i == 1) {
				maior_e = prod[i][2];
				ind_a = i;
			}
			else {
				if (prod[i][2] > maior_e) {
					maior_e = prod[i][2];
					ind_a = i;
				}
			}
		}

		System.out.println("O maior estoque do produto 2 está no armazém " + ind_a);
		for(int j = 1; j < 3; j++) {
			custo_p = 0;
			for(int i = 1; i < 4; i++) {
				custo_p = custo_p + prod[i][j];
			}
			custo_p = custo_p * prod[5][j];
			System.out.println("O custo total do produto " +  j + " = " + custo_p);
					
		}

		for(int i = 1; i < 4; i++) {
			custo_a = 0;
			for(int j = 1; j < 3; j++) {
				custo_a = custo_a + (prod[i][j] * prod[5][j]);
			}
			System.out.println("O custo total do armazém " + i + " = " + custo_a);
		}

	}

}
