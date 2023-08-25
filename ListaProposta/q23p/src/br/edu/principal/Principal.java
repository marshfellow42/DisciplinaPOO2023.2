package br.edu.principal;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Coloque a medida de um ângulo de um triângulo: ");
		int angulo_a = sc.nextInt();
		System.out.println("Coloque a outra medida de um ângulo: ");
		int angulo_b = sc.nextInt();;
		if ((angulo_a + angulo_b) < 180) {
			int angulo_c = 180 - (angulo_a + angulo_b);
			System.out.println("Essa é a terceira medida de um ângulo, para completar 180°: "+angulo_c+"°");
		}
		if ((angulo_a + angulo_b) == 180) {
			System.out.println("Você não era pra fazer isso, mas ok, a sua medida é igual a: 180°");
		}
		if ((angulo_a + angulo_b) > 180) {
			System.out.println("Isso já não é mais um triângulo");
		}
		
	}

}
