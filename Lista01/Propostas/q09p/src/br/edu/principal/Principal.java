package br.edu.principal;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Coloque o valor da base maior: ");
		int base_maior = sc.nextInt();
		System.out.println("Coloque o valor da base menor: ");
		int base_menor = sc.nextInt();
		System.out.println("Coloque a altura: ");
		int altura = sc.nextInt();
		int area = ((base_maior + base_menor) * altura)/2;
		
		System.out.println("Essa é a área do trapézio: "+area);
	}

}
