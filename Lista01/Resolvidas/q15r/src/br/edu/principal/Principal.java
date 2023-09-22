package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		int p_fab = 400000;
		int perc_d = 20;
		int perc_i = 5;
		int vlr_d = (p_fab * perc_d)/100;
		int vlr_i = (p_fab * perc_i)/100;
		int p_final = p_fab + vlr_d + vlr_i;
		
		System.out.println("Lucro do distribuidor: "+vlr_d);
		System.out.println("Valor dos impostos: "+vlr_i);
		System.out.println("Preço Final: "+p_final);

	}

}
