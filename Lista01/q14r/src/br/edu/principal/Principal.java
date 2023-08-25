package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		int ano_atual = 2023;
		int ano_nascimento = 2007;
		int idade_atual = ano_atual - ano_nascimento;
		int idade_2050 = 2050 - ano_nascimento;
		
		System.out.println("Sua idade atual: "+idade_atual);
		System.out.println("Sua idade em 2050: "+idade_2050);
	}

}
