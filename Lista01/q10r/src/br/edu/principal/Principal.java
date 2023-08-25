package br.edu.principal;

import java.text.*;

public class Principal {

	public static void main(String[] args) {
		DecimalFormat casas;
		casas = new DecimalFormat("0.00");
		
		int raio = 10;
		double area = 3.1415 * Math.pow(raio, 2);
		
		System.out.println(casas.format(area));
	}

}
