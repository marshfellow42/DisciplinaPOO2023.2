package br.edu.principal;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Coloque a sua nota: ");
		int x = sc.nextInt();
		System.out.println("Coloque outra nota: ");
		int y = sc.nextInt();
		int z = (x*2)+(y*3)/5;
		
		System.out.println("Nota final: "+z);
	}

}
