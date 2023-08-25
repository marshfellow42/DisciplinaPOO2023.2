package br.edu.principal;

public class Principal {
	public static void main (String[] args) {
		int salario = 4081;
		int grat = (salario * 5)/100;
		int imposto = (salario * 7)/100;
		int sal_receber = salario + grat - imposto;
		
		System.out.println(sal_receber);
	}
}
