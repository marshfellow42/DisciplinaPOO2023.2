package br.edu.principal;

import java.text.*;

public class Principal {
	public static void main (String[] args) {
		DecimalFormat casas;
		casas = new DecimalFormat("0.00");
		int ang = 45;
		int alt = 30;
		double radiano = (ang * 3.14)/180;
		double escada = alt/radiano;
		
		System.out.println(casas.format(escada)+"°");
	}

}
