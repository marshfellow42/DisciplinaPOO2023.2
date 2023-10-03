package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int num_aux, k, l , m, n, lin, col;
		Scanner sc = new Scanner (System.in);
		
		int num[][] = new int [5][4];
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; i < 4; i++) {
				num_aux = sc.nextInt();
				if (i == 1 && j == 1) {
					num[i][j] = num_aux;
				}
				else {
					k = 1;
					l = 1;
					while (num[k][l] < num_aux && (k != i || l != j)) {
						l = l + 1;
						if (l > 4) {
							k = k + 1;
							l = 1;
						}
						m = i;
						n = j;
						while (m != k || n != l) {
							if ((n-1) < 1) {
								lin = m-1;
								col = 4;
							}
							else {
								lin = m;
								col = n - 1;
							}
							num[m][n] = num[lin][col];
							n = n - 1;
							if (n < 1) {
								n = 4;
								m = m - 1;
							}
							num[k][l] = num_aux;
						}
					}
				}
			}
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println("Elemento da posição " + i + " - " + j + " = " + num[i][j]);
			}
		}
	}

}
