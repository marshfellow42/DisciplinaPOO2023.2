package br.edu.principal;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Coloque o tamanho de um lado: ");
		int lado_a = sc.nextInt();
		System.out.println("Coloque outro lado: ");
		int lado_b = sc.nextInt();
		int area = lado_a * lado_b;
		
		System.out.println("Essa é a area do quadrado: "+area);
	}

}
