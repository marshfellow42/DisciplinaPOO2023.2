package br.edu.principal;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o seu peso (em kg): ");
		int peso = sc.nextInt();
		int gordo = peso + (peso * 15)/100;
		int magro = peso - (peso * 20)/100;
		
		System.out.println("Caso você engorde 15%: "+gordo+"kg");
		System.out.println("Caso você emagreça 20%: "+magro+"kg");
		
	}

}
