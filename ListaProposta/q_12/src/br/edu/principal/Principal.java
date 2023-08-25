package br.edu.principal;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o valor do salário mínimo: ");
		int sal_min = sc.nextInt();
		System.out.println("Qual o valor que um funcionário ganha: ");
		int sal_fun = sc.nextInt();
		int qtd_sal = sal_fun/sal_min;
		
		System.out.println("Essa é a quantidade de salários mínimos que esse funcionário ganha: "+qtd_sal+" salários mínimos");
	}

}
