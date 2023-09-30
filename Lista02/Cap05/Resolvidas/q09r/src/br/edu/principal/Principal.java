package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double cont, n1, n2, media, ta, te, tr;
		double media_classe, total_classe;
		total_classe = 0;
		ta = 0;
		te = 0;
		tr = 0;
		for (cont = 1; cont <= 6;) {
			n1 = sc.nextDouble();
			n2 = sc.nextDouble();
			media = (n1+n2) / 2;
			System.out.print(media);
			if (media <= 3) {
				tr = tr + 1;
				System.out.print("Reprovado");
			}
			if (media > 3 && media < 7) {
				te = te + 1;
				System.out.print("Exame");
			}
			if (media >= 7) {
				ta = ta + 1;
				System.out.print("Aprovado");
			}
			total_classe = total_classe + media;
		}
		System.out.print(tr);
		System.out.print(te);
		System.out.print(ta);
		media_classe = total_classe/6;
		System.out.print(media_classe);
	}
}
