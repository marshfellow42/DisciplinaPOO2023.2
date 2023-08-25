package br.edu.principal;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Coloque o número de lados de um polígono convexo: ");
		int lados = sc.nextInt();
		int diagonais = lados * (lados - 3)/2;
		System.out.println("Esse é o número de diagonais desse polígono: "+diagonais);
		
	}

}
