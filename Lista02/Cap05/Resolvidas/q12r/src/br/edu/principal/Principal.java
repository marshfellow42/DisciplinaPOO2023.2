package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num_op;
		int pecas_op, num_maior, cont_m, cont_f;
		double tot_pecas, cont, media_m, salario_maior;
		double media_f, salario_op, tot_folha;
		String sexo_op;
		tot_folha = 0;
		tot_pecas = 0;
		media_m = 0;
		media_f = 0;
		cont_m = 0;
		cont_f = 0;
		salario_op = 0;
		salario_maior = 0;
		num_maior = 0;
		for (cont = 1; cont <= 15;) {
			System.out.printf("Digite o número do ", cont, "º operário ");
			num_op = sc.nextInt();
			System.out.print("Digite o sexo do operário (M ou F) ");
			sexo_op = sc.next();
			System.out.printf("Digite o total de peças fabricadas pelo ", cont, "º operário ");
			pecas_op = sc.nextInt();
			if (pecas_op <= 30) {
				salario_op = 450;
			}
			if (pecas_op > 30 && pecas_op <= 50) {
				salario_op = 450 + ((pecas_op-30) * 3/100 * 450);
			}
			if (pecas_op > 50) {
				salario_op = 450 + ((pecas_op-30) * 5/100 * 450);
			}
			System.out.printf("O operário de número ", num_op, "recebe salário = ", salario_op);
			tot_folha = tot_folha + salario_op;
			tot_pecas = tot_pecas + pecas_op;
			if (sexo_op == "M") {
				media_m = media_m + pecas_op;
				cont_m = cont_m + 1;
			}
			else {
				media_f = media_f + pecas_op;
				cont_f = cont_f + 1;
			}
			if (cont == 1) {
				salario_maior = salario_op;
				num_maior = num_op;
			}
			else {
				if (salario_op > salario_maior) {
					salario_maior = salario_op;
					num_maior = num_op;
				}
			}
		}
		System.out.printf("Total da folha de pagamento = ", tot_folha);
		System.out.printf("Total de peças fabricadas no mês =", tot_pecas);
		if (cont_m == 0) {
			System.out.print("NENHUM HOMEM");
		}
		else {
			media_m = media_m / cont_m;
			System.out.printf("Média de peças fabricadas por homens = ", media_m);
		}
		if (cont_f == 0) {
			System.out.print("NENHUMA MULHER");
		}
		else {
			media_f = media_f / cont_f;
			System.out.printf("Média de peças fabricadas por mulheres = ", media_f);
		}
		System.out.printf("O número do operário com maior salário é ", num_maior);
	}
}
