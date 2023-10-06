package br.edu.principal;

import java.util.Scanner;

public class Principal {
	
	public static int menor_elemento(int m[][]) {
		int me = m[1][7];
		int j = 5;
		
		for (int i = 2; i < 6; i++) {
			if (m[i][j] < me) {
				me = m[i][j];
			}
			j--;
		}
		
		return me;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int matriz[][] = new int [8][8];
		
		for (int x = 0; x < 6; x++) {
			for (int y = 0; y < 6; y++) {
				matriz[x][y] = sc.nextInt();
			}
		}
		
		int menor = menor_elemento(matriz);
		System.out.println(menor);
	}

}
