package br.edu.principal;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Coloque o preço de um produto: ");
		int x = sc.nextInt();
		int y = (x * 15)/100;
		int z = x - y;
		System.out.println("Esse é o preço do produto com 15% de desconto: "+z);
	}

}
