package br.edu.principal;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		int nota1 = sc.nextInt();
		System.out.println("Digite a segunda nota: ");
		int nota2 = sc.nextInt();
		System.out.println("Digite a terceira nota: ");
		int nota3 = sc.nextInt();
		int media = (nota1 + nota2 + nota3)/3;
		if (media >= 0 & media < 3) {
			System.out.println("Reprovado");
		}
		if (media >= 3 & media < 7) {
			System.out.println("Exame");
			int nota_exame = 12 - media;
			System.out.println("Deve tirar nota " + nota_exame + " para ser aprovado");
		}
		if (media >= 7 & media <= 10) {
			System.out.println("Aprovado");
		}
	}

}
