package br.edu.principal;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Coloque um número: ");
		int x = sc.nextInt();
		System.out.println("Coloque outro número: ");
		int y = sc.nextInt();
		int z = x/y;
		System.out.println("Essa é a divisão dos dois: "+z);
	}

}
