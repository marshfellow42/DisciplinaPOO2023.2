package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		int deposito = 2000;
		int taxa = 20;
		int rendimento = (deposito * taxa)/100;
		int total = deposito + rendimento;
		
		System.out.println("Seu rendimento foi: "+rendimento);
		
		System.out.println("Seu total é: " + total);
	}

}
