package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int idadeMS = 0, idade, maior_idade = 0, menor_idade = 999;
	    int pos = 1, i = 0, contM = 0;
	    float salario, menor_salario = 99999, soma_salario = 0, media;
	    char sexo, sexoMS = 0;
	    
	    Scanner sc = new Scanner (System.in);

	    do {
	        System.out.printf("%dº Pessoa \n", pos);
	        System.out.printf("    Digite sua idade: ");
	        idade = sc.nextInt();

	        if (idade < 0) {
	            break;
	        }
	        System.out.printf("    Digite seu sexo(M. Masculino | F. Feminino): ");
	        sexo = sc.next().toUpperCase().charAt(0);
	        System.out.printf("    Digite seu salário: ");
	        salario = sc.nextInt();
	        System.out.printf("\n");

	        if (sexo == 'F' && salario <= 200) {
	            contM++;
	        }
	        //Maior idade
	        if (idade > maior_idade) {
	            maior_idade = idade;
	        }
	        //Menor idade
	        if (idade < menor_idade) {
	            menor_idade = idade;
	        }
	        //Menor salário
	        if (salario < menor_salario) {
	            menor_salario = salario;
	            idadeMS = idade;
	            sexoMS = sexo;
	        }

	        i++;
	        pos++;
	        soma_salario += salario; //Soma de todos os salários digitados
	    } while (idade > 0);

	    media = soma_salario / i;

	    System.out.printf("\nDADOS FINAIS \n");
	    if (i > 0) {
	        System.out.printf("    A media de salária é: R$ %.2f \n", media);
	        System.out.printf("    A menor idade é: %d. \n", menor_idade);
	        System.out.printf("    A maior idade é: %d. \n", maior_idade);
	        System.out.printf("    Quantidade de mulheres com salário inferior a R$ 200.00: %d \n", contM);
	        System.out.printf("    Menor salário é de R$ %.2f, pertence a uma pessoa do sexo %c com %d anos. \n", menor_salario, sexoMS, idadeMS);
	    } else {
	        System.out.printf("Nenhuma entrada registrada. \n");
	    }

	}

}
