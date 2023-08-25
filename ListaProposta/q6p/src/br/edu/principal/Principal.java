package br.edu.principal;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Coloque seu salário: ");
		int sal = sc.nextInt();
		System.out.println("Coloque quantas comissões você fez: ");
		int ven = sc.nextInt();
		int vlr_com = (ven * 4)/100;
		int sal_fin = sal + vlr_com;
		
		System.out.println("Esse é o seu salário final: "+sal_fin);
		
	}

}
