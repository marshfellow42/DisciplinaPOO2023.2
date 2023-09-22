package br.edu.principal;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int num = sc.nextInt();
		int r = (num%2);
		
		if (r == 0) {
			System.out.println("O número é par");
		}
		else {
			System.out.println("O número é impar");
		}
	}

}
