package br.edu.principal;

public class Principal {
	public static void main (String[] args) {
		int salario = 4388;
		int imposto = (salario * 10)/100;
		int sal_receber = salario + 50 - imposto;
		
		System.out.println(sal_receber);
	}
}
