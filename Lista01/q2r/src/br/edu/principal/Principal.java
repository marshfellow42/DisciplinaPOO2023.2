package br.edu.principal;

import java.text.*;

public class Principal {

	public static void main(String[] args) {
		DecimalFormat casas;
		
		casas = new DecimalFormat("0.00");
		
		double n1 = 5.434123;
		double n2 = 6.324132;
		double n3 = 8.231324;
		
		System.out.println("Nota 1: " + n1);
		System.out.println("Nota 2: " + n2);
		System.out.println("Nota 3: " + n3);
		
		double media = (n1 + n2 + n3)/3;
		
		System.out.println("Média = "+casas.format(media));
		

	}

}
