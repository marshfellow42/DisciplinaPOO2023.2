package br.edu.principal;

import java.text.*;
public class Principal {

	public static void main(String[] args) {
		DecimalFormat casas;
		casas = new DecimalFormat("0.00");
		
		int salario = 7500;
		int cheque1 = 1100;
		int cheque2 = 2200;
		double cpmf1 = (cheque1 * 0.38)/100;
		double cpmf2 = (cheque2 * 0.38)/100;
		double saldo = salario - cheque1 - cheque2 - cpmf1 - cpmf2;
		
		System.out.println(casas.format(saldo));
	}

}
