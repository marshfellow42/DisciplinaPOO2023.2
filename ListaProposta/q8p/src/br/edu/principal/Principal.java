package br.edu.principal;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o seu peso (em kg)");
		int peso = sc.nextInt();
		int conversao = peso * 1000;
		
		System.out.println("Esse é o seu peso em gramas: "+conversao+" gramas");
	}

}
