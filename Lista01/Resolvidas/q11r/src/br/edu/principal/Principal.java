package br.edu.principal;

import java.text.DecimalFormat;

public class Principal {
	public static void main (String[] args) {
		DecimalFormat casas;
		casas = new DecimalFormat("0.00");
		
		int numero = 10;
		double quadrado = Math.pow(numero, 2);
		double cubo = Math.pow(numero, 3);
		double r2 = Math.sqrt(numero);
		double r3 = Math.cbrt(numero);
		
		if ((quadrado % 1) == 0) {
			int value1 = (int)quadrado;
			System.out.println("O quadrado do seu número: " +value1);
		}
		
		else if ((quadrado % 1) != 0) {
			System.out.println("O quadrado do seu número: " +quadrado);
		}
			
		
		if ((cubo % 1) == 0) {
			int value2 = (int)cubo;
			System.out.println("O cubo do seu número: "+value2);
		}
		
		else if ((cubo % 1) != 0) {
			System.out.println("O cubo do seu número: "+cubo);
		}
		
		
		if ((r2 % 1) == 0) {
			int value3 = (int)r2;
			System.out.println("A raiz quadrada do seu número é: "+value3);
		}
		
		else if ((r2 % 1) != 0) {
			System.out.println("A raiz quadrada do seu número é aproximadamente: "+casas.format(r2));
		}
		
		
		if ((r3 % 1) == 0) {
			int value4 = (int)r3;
			System.out.println("A raiz cúbica do seu número é: "+value4);

		}
		
		else if ((r3 % 1) != 0) {
			System.out.println("A raiz cúbica do seu número é aproximadamente: "+casas.format(r3));
		}
		
		
	}

}
