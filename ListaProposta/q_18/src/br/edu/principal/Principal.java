package br.edu.principal;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Coloque a temperatura da sua região (em Celsius): ");
		int celsius = sc.nextInt();
		int Fahrenheit = 180 * (celsius + 32)/100;
		System.out.println("Essa é a temperatura da sua região em Fahrenheit: "+Fahrenheit+"°F");
	}

}
