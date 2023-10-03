package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int menor_cons = 0, menor_vei = 0, valor;
		int consumo[] = new int [6];
		String veiculo[] = new String [6];
		Scanner sc = new Scanner (System.in);
		
		for (int i = 1; i <= 5; i++) {
			System.out.print("Coloque o nome do " + i + "° veículo: ");
			veiculo[i] = sc.next();
		}
		
		System.out.println("");
		
		for (int i = 1; i <= 5; i++) {
			System.out.print("Coloque o valor de consumo da gasolina do veículo " + i + ": ");
			consumo[i] = sc.nextInt();
			if (i == 1) {
				menor_cons = consumo[i];
				menor_vei = i;
			}
			
			else {
				if(consumo[i] < menor_cons) {
					menor_cons = consumo[i];
					menor_vei = i;
				}
			}
			
			valor = 1000/consumo[i];
			
			System.out.println("O veiculo " + veiculo[i] + " consome " + valor + " litro(s) de combustível para percorrer 1000 Km");
		}
		
		System.out.println("O veículo mais econômico é " + veiculo[menor_vei]);
		
		
	}

}
