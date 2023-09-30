package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont, codigo, nht, valor;
		int sal_min, sal_inicial, aux, sal_final;
		String turno, categoria;
		sal_min = 450;
		for (cont = 1; cont <= 10;) {
			codigo = sc.nextInt();
			nht = sc.nextInt();
			turno = sc.next();
			categoria = sc.next();
			while (turno != "M" && turno != "V" && turno != "N") {
				turno = sc.next();
			}
			while (categoria != "G" && categoria != "O") {
				categoria = sc.next();
			}
			if (categoria == "G") {
				if (turno == "N") {
					valor = sal_min * 18/100;
				}
				else {
					valor = sal_min * 15/100;
				}
			}
			else {
				if (turno == "N") {
					valor = sal_min * 13/100;
				}
				else {
					valor = sal_min * 10/100;
				}
			}
			sal_inicial = nht * valor;
			if (sal_inicial <= 300) {
				aux = sal_inicial * 20/100;
			}
			else if (sal_inicial < 600) {
				aux = sal_inicial * 15/100;
			}
			else {
				aux = sal_inicial * 5/100;
			}
			sal_final = sal_inicial + aux;
			System.out.print(codigo);
			System.out.print(nht);
			System.out.print(valor);
			System.out.print(sal_inicial);
			System.out.print(aux);
			System.out.print(sal_final);
		}
	}
}
