package br.edu.principal;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int senha = sc.nextInt();
		if (senha == 4531) {
			System.out.println("Acesso permitido");
		}
		else {
			System.out.println("Acesso negado");
		}
	}

}
