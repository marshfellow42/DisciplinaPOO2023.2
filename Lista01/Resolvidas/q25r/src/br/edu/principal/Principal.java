package br.edu.principal;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Custo do espetáculo teatral: ");
		int custo = sc.nextInt();
		System.out.println("Preço do convite: ");
		int convite = sc.nextInt();
		int qtd = custo/convite;
		
		System.out.println("Quantos convites devem ser vendidos para que os gastos sejam cobertos: "+qtd+" convites");
	}

}
