package br.edu.principal;

import java.util.*;
import java.text.*;

public class Principal {

	public static void main(String[] args) {
		DecimalFormat casas;
		casas = new DecimalFormat("0.00");
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos reais você vai levar para viajar: ");
		int reais = sc.nextInt();
		double dolar = reais / 1.80;
		double marco = reais / 2;
		double libra = reais / 3.57;
		
		System.out.println("Essa é a conversão em dolar: "+casas.format(dolar));
		System.out.println("Essa é a conversão em marco: "+casas.format(marco));
		System.out.println("Essa é a conversão em libra: "+casas.format(libra));
	}

}
