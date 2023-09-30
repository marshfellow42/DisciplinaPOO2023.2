package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int opcao, meses;
	    double salario, n_salario = 0, ferias, decimo_terceiro;
	    
	    Scanner sc = new Scanner (System.in);

	    do {
	        System.out.printf("Menu de op��es \n");
	        System.out.printf("\t 1. Novo sal�rio \n\t 2. F�rias \n\t 3. 13� Sal�rio \n\t 4. Sair \n");
	        System.out.printf("Digite a op��o desejada: ");
	        opcao = sc.nextInt();
	        System.out.printf("\n");

	        if (opcao == 4) {
	            break;
	        }

	        switch (opcao) {
	            case 1:
	                System.out.printf("Novo sal�rio \n");
	                System.out.printf("    Digite seu sal�rio atual: ");
	                salario = sc.nextDouble();

	                if (salario < 210) {
	                    n_salario = salario * 1.15; //Aumento de 15%
	                } else if (salario >= 210 && salario <= 600) {
	                    n_salario = salario * 1.10; //Aumento de 10%
	                } else if (salario > 600) {
	                    n_salario = salario * 1.05; //Aumento de 5%
	                }

	                System.out.printf("    Seu novo sal�rio sera de R$ %.2f. \n \n", n_salario);
	                break;

	            case 2:
	                System.out.printf("F�rias \n");
	                System.out.printf("    Digite seu sal�rio atual: ");
	                salario = sc.nextDouble();
	                ferias = salario + (salario / 3);
	                System.out.printf("    O valor de suas f�rias � de R$ %.2f. \n \n", ferias);
	                break;

	            case 3:
	                System.out.printf("13� Sal�rio \n");
	                System.out.printf("Digite seu sal�rio atual: ");
	                salario = sc.nextDouble();
	                do {
	                    System.out.printf("    Digite a quantidade de meses trabalhados (No m�ximo 12): ");
	                    meses = sc.nextInt();

	                    decimo_terceiro = salario * meses / 12;

	                    System.out.printf("    Voc� receber� R$ %.2f de 13�. \n\n", decimo_terceiro);
	                } while (meses > 12);
	                break;
	                
	            default: 
	                System.out.printf("Op��o inv�lida. \n\n");
	        }
	    } while (opcao != 4);

	}

}
