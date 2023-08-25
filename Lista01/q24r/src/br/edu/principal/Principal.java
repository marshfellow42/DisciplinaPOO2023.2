package br.edu.principal;

import java.util.*;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Coloque uma hora: ");
		double hora = sc.nextDouble();
		int h = (int)hora;
		double m = hora - h;
		double conversao = (h * 60) - (m * 100);
		
		System.out.println(conversao+" minutos");
		
	}

}
