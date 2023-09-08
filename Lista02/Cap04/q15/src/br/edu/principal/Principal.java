package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sal_min, nht, ndep, nhet;
		int sal_receber, vh, smes, vdep, vhe, imp;
		int sbruto, sliq, grat;
		
		sal_min = sc.nextInt();
		nht = sc.nextInt();
		ndep = sc.nextInt();
		nhet = sc.nextInt();
		vh = (1/5 * sal_min);
		smes = (nht * vh);
		vdep = (32 * ndep);
		vhe = (nhet * (vh + (vh * 50/100)));
		sbruto = (smes + vdep + vhe);
		
		if (sbruto < 200) {
			imp = 0;
		}
		if (sbruto >= 200 && sbruto <= 500) {
			imp = sbruto * 10/100;
		}		
		if (sbruto > 500) {
			imp = sbruto * 20/100;
		}
		
		sliq = sbruto - imp;
		if (sliq <= 350) {
			grat = 100;
		}
		if (sliq > 350) {
			grat = 50;
		}
		
		sal_receber = sliq + grat;
		System.out.println(sal_receber);
	}
}
