package br.edu.principal;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor = sc.nextInt();
		int esc = sc.nextInt();
		if (esc == 1) {
			int poupanca = valor + (valor * 3/100);
			System.out.println(poupanca);
			
		}
		
		else if (esc == 2) {
			int renda_fixa = valor + (valor * 4/100);
			System.out.println(renda_fixa);
		}
	}

}
