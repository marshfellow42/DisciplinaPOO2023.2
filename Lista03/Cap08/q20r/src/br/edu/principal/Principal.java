package br.edu.principal;

import java.util.Scanner;

public class Principal {
	
	public static int media_aritmetica(int m[][]) {
		int cont = 0, soma = 0;
		
		for (int i = 2; i < 12; i++) {
			for (int j = 12; j > (14 - i); j--) {
				soma = soma + m[i][j];
				cont++;
			}
		}
		
		int media = soma/cont;
		return media;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int matriz[][] = new int [13][13];
		
		for (int x = 0; x < 12; x++) {
			for (int y = 0; y < 12; y++) {
				matriz[x][y] = sc.nextInt();
			}
		}
		
		int m = media_aritmetica(matriz);
		
		System.out.println(m);
	}

}
