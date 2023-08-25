package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Coloque seu salário: ");
		int vlr_sal = sc.nextInt();
		System.out.println("Coloque a quantidade de quilowatts consumida por sua residencia: ");
		int qtd_kw = sc.nextInt();
		int vlr_kw = vlr_sal/5;
		int vlr_reais = vlr_kw * qtd_kw;
		int desc = (vlr_reais * 15)/100;
		int vlr_desc = vlr_reais - desc;
		
		System.out.println("Valor de cada quilowatt: R$"+vlr_kw);
		System.out.println("Valor a ser pago: R$"+vlr_reais);
		System.out.println("Valor com um desconto de 15%: R$"+vlr_desc);
	}

}
