package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int canal, quant_pessoas;
	    int cont4 = 0, cont5 = 0, cont7 = 0, cont12 = 0;
	    int soma4 = 0, soma5 = 0, soma7 = 0, soma12 = 0, soma_total = 0;
	    double porcentagem4, porcentagem5, porcentagem7, porcentagem12;
	    Scanner sc = new Scanner (System.in);
	    
	    do {
	        System.out.println("Digite o número do canal: ");
	        canal = sc.nextInt();

	        switch (canal) {
	            case 4:
	                cont4++;
	                System.out.println("Digite a quantidade de pessoas que esta assistindo: ");
	                quant_pessoas = sc.nextInt();
	                soma4 += quant_pessoas;
	                soma_total += quant_pessoas;
	                break;

	            case 5:
	                cont5++;
	                System.out.println("Digite a quantidade de pessoas que esta assistindo: ");
	                quant_pessoas = sc.nextInt();
	                soma5 += quant_pessoas;
	                soma_total += quant_pessoas;
	                break;

	            case 7:
	                cont7++;
	                System.out.println("Digite a quantidade de pessoas que esta assistindo: ");
	                quant_pessoas = sc.nextInt();
	                soma7 += quant_pessoas;
	                soma_total += quant_pessoas;
	                break;

	            case 12:
	                cont12++;
	                System.out.println("Digite a quantidade de pessoas que esta assistindo: ");
	                quant_pessoas = sc.nextInt();
	                soma12 += quant_pessoas;
	                soma_total += quant_pessoas;
	                break;

	            default:
	            	System.out.println("Opção inválida. ");
	                break;
	        }

	    } while (canal != 0);
	    
	    if (cont4 > 0) {
	        porcentagem4 = soma4 * 100 / soma_total;
	        System.out.printf("    Porcentagem de pessoas que assistem o canaal 4: %.1f. ", porcentagem4);
	    } else {
	        System.out.println("    Nenhuma pessoa assiste o canal 4. ");
	    }

	    //Canal 5
	    if (cont5 > 0) {
	        porcentagem5 = soma5 * 100 / soma_total;
	        System.out.printf("    Porcentagem de pessoas que assistem o canaal 5: %.1f. ", porcentagem5);
	    } else {
	        System.out.println("    Nenhuma pessoa assiste o canal 5. ");
	    }

	    //Canal 7
	    if (cont7 > 0) {
	        porcentagem7 = soma7 * 100 / soma_total;
	        System.out.printf("    Porcentagem de pessoas que assistem o canaal 7: %.1f. ", porcentagem7);
	    } else {
	        System.out.println("    Nenhuma pessoa assiste o canal 7. ");
	    }
	    
	    //Canal 12
	    if (cont12 > 0) {
	        porcentagem12 = soma12 * 100 / soma_total;
	        System.out.printf("    Porcentagem de pessoas que assistem o canaal 12: %.1f. ", porcentagem12);
	    } else {
	        System.out.println("    Nenhuma pessoa assiste o canal 12. ");
	    }
	}

}
