package br.edu.principal;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Coloque o tamanho da diagonal maior: ");
		int diagonal_maior = sc.nextInt();
		System.out.println("Coloque o tamanho da diagonal menor: ");
		int diagonal_menor = sc.nextInt();
		int area = (diagonal_maior * diagonal_menor)/2;
		
		System.out.println("Esse é o valor da área de um losango: "+area);
	}

}
