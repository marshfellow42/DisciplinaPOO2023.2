package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		char acao;
	    double preco_compra, preco_venda, lucro, lucro_total = 0;
	    int i = 1, cont1 = 0, cont2 = 0;
	    Scanner sc = new Scanner (System.in);

	    System.out.printf("Digite qualquer letra para entrar com uma ação ou F para sair. \n");
	    do {
	        System.out.printf("\n %dº Ação \n", i);
	        System.out.printf("    Digite o tipo de ação: ");
	        acao = sc.next().toUpperCase().charAt(0);

	        //Se o usuario entrar com F o programa será encerrado automaticamente.
	        if (acao == 'F') {
	            break;
	        }

	        System.out.printf("    Digite o valor de compra: ");
	        preco_compra = sc.nextDouble();
	        System.out.printf("    Digite o valor de venda: ");
	        preco_venda = sc.nextDouble();

	        lucro = preco_venda - preco_compra;
	        if (lucro > 0) {
	            System.out.printf("    Seu lucro será de R$ %.2f \n", lucro);
	        } else {
	            System.out.printf("    Você terá um prejuizo de R5 %.2f \n", lucro * (-1));
	        }

	        if (lucro > 1000) {
	            cont1++;
	        } else if (lucro < 200) {
	            cont2++;
	        }
	        if (acao != 'F') {
	            lucro_total += lucro;
	            i++;
	        }
	    } while (acao != 'F');

	    System.out.printf("DADOS FINAIS \n");
	    System.out.printf("    Quantidade de ações com lucro superior a R$ 1000,00: %d. \n", cont1);
	    System.out.printf("    Quantidade de ações com lucro inferior a R$ 200,00: %d. \n", cont2);
	    System.out.printf("    Lucro total da empresa será de R$ %.2f. \n", lucro_total);

	}

}
