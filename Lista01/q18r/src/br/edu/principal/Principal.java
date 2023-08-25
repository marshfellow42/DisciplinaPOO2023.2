package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		int peso_saco = 25;
		int qtd_racao1 = 300;
		int qtd_racao2 = 200;
		int racao_gato1 = qtd_racao1/100;
		int racao_gato2 = qtd_racao2/100;
		int total_final = peso_saco - 5 * (racao_gato1 + racao_gato2);
		
		System.out.println(total_final);
		/*
		 * Don't know how this work
		 * 
		 * Need to find a solution online or with the book's official solution
		 */
	}

}
