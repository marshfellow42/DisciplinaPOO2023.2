package br.edu.principal;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Coloque um número: ");
		int x = sc.nextInt();
		System.out.println("Coloque outro número: ");
		int y = sc.nextInt();
		System.out.println("Coloque o número final");
		int z = sc.nextInt();
		int m = x * y * z;
		
		System.out.println(m);
	}

}
