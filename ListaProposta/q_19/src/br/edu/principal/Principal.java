package br.edu.principal;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		// Cada m² = 18W
		Scanner sc = new Scanner(System.in);
		System.out.println("Coloque a largura do seu comodo (em metros): ");
		int largura = sc.nextInt();
		System.out.println("Coloque a altura do seu comodo (em metros): ");
		int altura = sc.nextInt();
		int area = largura * altura;
		int potencia = area * 18;
		
		System.out.println("Essa é a potência de iluminação que deverá ser utilizada: "+potencia+"W");
	}

}
