package br.edu.principal;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Coloque a altura que deseja pregar o quadro, em metros: ");
		int x = sc.nextInt();
		System.out.println("Coloque a altura da escada, em metros");
		int z = sc.nextInt();
		double y = Math.pow(z, 2) - Math.pow(x, 2);
		double o = Math.pow(y, 2);
		
		System.out.println(o+" centímetros");
		
	}

}
