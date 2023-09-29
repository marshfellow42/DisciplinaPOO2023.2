package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int opcao, meses;
	    double salario, n_salario = 0, ferias, decimo_terceiro;
	    
	    Scanner sc = new Scanner (System.in);

	    do {
	        System.out.printf("Menu de opções \n");
	        System.out.printf("\t 1. Novo salário \n\t 2. Férias \n\t 3. 13º Salário \n\t 4. Sair \n");
	        System.out.printf("Digite a opção desejada: ");
	        opcao = sc.nextInt();
	        System.out.printf("\n");

	        if (opcao == 4) {
	            break;
	        }

	        switch (opcao) {
	            case 1:
	                System.out.printf("Novo salário \n");
	                System.out.printf("    Digite seu salário atual: ");
	                salario = sc.nextDouble();

	                if (salario < 210) {
	                    n_salario = salario * 1.15; //Aumento de 15%
	                } else if (salario >= 210 && salario <= 600) {
	                    n_salario = salario * 1.10; //Aumento de 10%
	                } else if (salario > 600) {
	                    n_salario = salario * 1.05; //Aumento de 5%
	                }

	                System.out.printf("    Seu novo salário sera de R$ %.2f. \n \n", n_salario);
	                break;

	            case 2:
	                System.out.printf("Férias \n");
	                System.out.printf("    Digite seu salário atual: ");
	                salario = sc.nextDouble();
	                ferias = salario + (salario / 3);
	                System.out.printf("    O valor de suas férias é de R$ %.2f. \n \n", ferias);
	                break;

	            case 3:
	                System.out.printf("13º Salário \n");
	                System.out.printf("Digite seu salário atual: ");
	                salario = sc.nextDouble();
	                do {
	                    System.out.printf("    Digite a quantidade de meses trabalhados (No máximo 12): ");
	                    meses = sc.nextInt();

	                    decimo_terceiro = salario * meses / 12;

	                    System.out.printf("    Você receberá R$ %.2f de 13º. \n\n", decimo_terceiro);
	                } while (meses > 12);
	                break;
	                
	            default: 
	                System.out.printf("Opção inválida. \n\n");
	        }
	    } while (opcao != 4);

	}

}
