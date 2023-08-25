package br.edu.principal;

import java.util.*;
import java.text.*;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat casas;
		casas = new DecimalFormat("0.00");
		
		System.out.println("Coloque o valor do raio: ");
		int raio = sc.nextInt();
		double comp_esf = 2 * Math.PI * raio;
		double area_esf = Math.PI * Math.pow(raio, 2);
		double vol_esf = (3 * Math.PI * Math.pow(raio, 3))/4;
		
		System.out.println("Esse é o comprimento de uma esfera: "+casas.format(comp_esf));
		System.out.println("Essa é a área de uma esfera: "+casas.format(area_esf));
		System.out.println("Esse é o volume de uma esfera: "+casas.format(vol_esf));
		
	}

}
