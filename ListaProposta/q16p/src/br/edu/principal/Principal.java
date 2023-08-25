package br.edu.principal;

import java.util.*;
import java.text.*;

public class Principal {

	public static void main(String[] args) {
		DecimalFormat casas;
		casas = new DecimalFormat("0.00");
		Scanner sc = new Scanner(System.in);
		System.out.println("Coloque o valor do cateto a: ");
		int cateto_a = sc.nextInt();
		System.out.println("Coloque o valor do cateto b: ");
		int cateto_b = sc.nextInt();
		double hipotenusa = Math.sqrt(Math.pow(cateto_a, 2) + Math.pow(cateto_b, 2));
		System.out.println("Esse é o valor da hipotenusa: "+casas.format(hipotenusa));
	}

}
