package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sal_base, tempo = 0, imposto, grat = 0;
		int sal_liq;
		sal_base = sc.nextInt();
		if (sal_base < 200) {
			imposto = 0;
		}
		else if (sal_base <= 450) {
			imposto = 3/100 * sal_base;
			}
			else if (sal_base < 700) {
				imposto = 8/100 * sal_base;
				if (sal_base > 700) {
					imposto = 12/100 * sal_base;
				}
		System.out.print(imposto);
		if (sal_base > 500) {
			if (tempo <= 3) {
				grat = 20;
				if (tempo > 3) {
					grat = 30;
				}
			}
			
		}
		else {
			if (tempo <= 3) {
				grat = 23;
			}
				else if (tempo < 6)	{
					grat = 35;
					if (tempo > 6) {
						grat = 33;
					}
				}
		System.out.print(grat);
		sal_liq = sal_base - imposto + grat;
		System.out.print(sal_liq);
		if (sal_liq <= 350) {
			System.out.println("Classificação A");
		}
		else if (sal_liq < 600) {
			System.out.println("Classificação B");
			
		}
		if (sal_liq > 600){
			System.out.println("Classificação C");
		}
			
		}
		
	}

}
}
