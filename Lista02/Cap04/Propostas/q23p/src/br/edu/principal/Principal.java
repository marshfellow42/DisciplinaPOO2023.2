package br.edu.principal;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual o código do seu produto?: ");
		int codigo = sc.nextInt();
		System.out.print("Quantas unidades você comprou?: ");
		int qtd = sc.nextInt();
		int preco = 0;
		
		if (codigo <= 10) {
			preco = 10 * qtd;
			System.out.println("O preco unitario dele é R$10");
		}
		else if (codigo <= 20) {
			preco = 15 * qtd;
			System.out.println("O preco unitario dele é R$15");
		}
		else if (codigo <= 30) {
			preco = 20 * qtd;
			System.out.println("O preco unitario dele é R$20");
		}
		else if (codigo <= 40) {
			preco = 30 * qtd;
			System.out.println("O preco unitario dele é R$30");
		}
		
		else {
			System.out.println("Código invalido");
		}
		
		if (preco < 250) {
			int desc = preco * 5/100;
			preco = preco - (preco * 5/100);
			System.out.println("O valor descontado foi: R$" + desc);
		}
		else if (preco > 250 && preco < 500) {
			int desc = preco * 10/100;
			preco = preco - (preco * 10/100);
			System.out.println("O valor descontado foi: R$" + desc);
		}
		else if (preco > 500) {
			int desc = preco * 15/100;
			preco = preco - (preco * 15/100);
			System.out.println("O valor descontado foi: R$" + desc);
		}
		
		System.out.println("Preço final: R$" + preco);
		
	}

}
