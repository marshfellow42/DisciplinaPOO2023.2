package br.edu.principal;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual número você deseja ver a tabuada: ");
		int num = sc.nextInt();
		int i = 0;
		while (i == 0 || i < 10) {
			int x = ++i;
			int mult = num * i;
			System.out.println(num+" x "+x+" = "+mult);
		}
	}

}
