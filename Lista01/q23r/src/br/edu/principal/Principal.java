package br.edu.principal;

import java.util.Scanner;
import java.text.*;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat casas;
		casas = new DecimalFormat("0.00");
		
		System.out.println("Coloque um número (Se for fracionário, coloque uma vírgula): ");
		double num = sc.nextDouble();
		int i = (int)num;
		double f = num - i;
		String a = casas.format(num);
		
		System.out.println("Número Inteiro: "+i);
		System.out.println("Número Fracionário: "+f);
		System.out.println("Número Arredondado: "+a);
	}

}
