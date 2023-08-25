package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		int n1 = 3;
		int n2 = 4;
		int n3 = 5;
		
		int p1 = 6;
		int p2 = 7;
		int p3 = 9;
		
		int soma1 = n1 * p1;
		int soma2 = n2 * p2;
		int soma3 = n3 * p3;
		int total = p1 + p2 + p3;
		
		int media = (soma1 + soma2 + soma3)/total;
				
		System.out.println(media);

	}

}
