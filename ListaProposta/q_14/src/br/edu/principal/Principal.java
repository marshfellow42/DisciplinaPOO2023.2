package br.edu.principal;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quando você nasceu: ");
		int nasc = sc.nextInt();
		System.out.println("Qual ano estamos: ");
		int ano_atual = sc.nextInt();
		int anos = ano_atual - nasc;
		int meses = anos * 12;
		int semanas = meses * 4;
		int dias = semanas * 7;
		
		System.out.println("Idade: "+anos+" anos");
		System.out.println("Idade em meses: "+meses+" meses");
		System.out.println("Idade em semanas: "+semanas+" semanas");
		System.out.println("Idade em dias: "+dias+" dias");
	}

}
