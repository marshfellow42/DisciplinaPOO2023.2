package br.edu.principal;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nota1 = sc.nextInt();
		int nota2 = sc.nextInt();
		int nota3 = sc.nextInt();
		int nota4 = sc.nextInt();
		int media = (nota1 + nota2 + nota3 + nota4)/4;
		
		if (media > 7) {
			System.out.println("Você foi aprovado");
		}
		else {
			System.out.println("Você foi reprovado");
		}
	}

}
