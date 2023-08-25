package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Selecione um número: ");
		int x = sc.nextInt();
		System.out.println("Selecione outro número: ");
		int y = sc.nextInt();
		int z = x - y;
		
		System.out.println(z);
	}

}
