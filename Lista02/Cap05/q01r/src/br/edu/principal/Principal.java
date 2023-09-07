package br.edu.principal;

import java.util.*;
import java.text.*;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		NumberFormat casas;
		casas = NumberFormat.getInstance(Locale.US);
		
		System.out.print("Até que ano você trabalhou, após 2007?: ");
		int ano_atual = sc.nextInt();
		int salario = 1000;
		double percentual = 1.5/100;
		double novo_salario = salario + percentual * salario;
		
		for (int i = 2007; i < ano_atual; i++) {
			percentual = 2 * percentual;
			novo_salario = novo_salario + percentual * novo_salario;
		}
		
		int x = (int)novo_salario;
		System.out.print("Seu salário atual é: R$ " + casas.format(x));
	}

}
