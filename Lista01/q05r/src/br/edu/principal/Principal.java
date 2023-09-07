package br.edu.principal;

public class Principal {
	public static void main (String[] args) {
		int salario = 3000;
		int percentual = 45;
		int aumento = (salario * percentual)/100;
		int novosal = salario + aumento;
		
		System.out.println("Salário: " + salario + ", com aumento de: " + percentual + "%");
		
		System.out.println("Aumento: "+ aumento);

		System.out.println("Salário novo: " + novosal);
		
	}
}
