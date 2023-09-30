package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int preco, imp, transp, seguro, fin, total_imp, origem;
		String meio_t, carga;
		transp = 0;
		total_imp = 0;
		preco = sc.nextInt();
		while (preco > 0) {
			origem = sc.nextInt();
			meio_t = sc.next();
			carga = sc.next();
			if (preco <= 100 ) {
				imp = preco * 5 / 100;
			}
			else {
				imp = preco * 10 / 100;
			}
			if (carga == "S") {
				if (origem == 1) {
					transp = 50;
				}
				if (origem == 2) {
					transp = 21;
				}
				if (origem == 3) {
					transp = 24;
				}
			}
			if (carga == "N") {
				if (origem == 1) {
					transp = 12;
				}
				if (origem == 2) {
					transp = 21;
				}
				if (origem == 3) {
					transp = 60;
				}
			}
			if (origem == 2 || meio_t == "A") {
				seguro = preco/2;
			}
			else {
				seguro = 0;
			}
			fin = preco + imp + transp + seguro;
			total_imp += imp;
			System.out.print(imp);
			System.out.print(transp);
			System.out.print(seguro);
			System.out.print(fin);
			preco = sc.nextInt();
		}
		System.out.print(total_imp);
	}
}
