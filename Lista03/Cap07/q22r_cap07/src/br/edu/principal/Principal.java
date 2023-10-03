package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		int prod[5][3], quant_prod2[C], ult_linha = L - 1;
	    int i, j;

	    //Como não é para prencher a ultima linha basta subtrair 1 do indice
	    for (i = 0; i < L - 1; i++) {
	        printf("%dº prod \n\n", i + 1);
	        for (j = 0; j < C; j++) {
	            printf("Produto %d \n", j + 1);
	            printf("Itens armazenados: ");
	            scanf("%d", &prod[i][j]);
	            printf("\n");
	        }
	    }

	    //Laço para armazenar os valores na ultima linha da matriz
	    printf("Preços \n");
	    for (i = 0; i < C; i++) {
	        printf("Preço produto %d: ", i + 1);
	        scanf("%d", &prod[L - 1][i]);
	    }

	    //Somar estoque de cada prod
	    int somaEstoque[C], p = 0;
	    for (i = 0; i < L - 1; i++) {
	        somaEstoque[p] = 0;
	        for (j = 0; j < C; j++) {
	            somaEstoque[p] += prod[i][j];
	        }
	        p++;
	    }

	    //Menor estoque
	    int menorEstoque = somaEstoque[0];
	    for (i = 0; i < L - 1; i++) {
	        if (somaEstoque[i] < menorEstoque) {
	            menorEstoque = i;
	        }
	    }

	    //Maior estoque do produto 2
	    int maior_estoqueP2 = prod[0][1];
	    for (i = 0; i < L - 1; i++) {
	        if (prod[i][1] > maior_estoqueP2) {
	            maior_estoqueP2 = i;
	        }
	    }

	    //Custo de cada prod;
	    int custo[L - 1];
	    p = 0;
	    for (i = 0; i < L - 1; i++) {
	        for (j = 0; j < L - 1; j++) {
	            custo[p] += prod[i][j] * prod[L - 1][j];
	        }
	        p++;
	    }


	    printf("-------------------------RELATÓRIO-------------------------\n\n");
	    for (i = 0; i < L - 1; i++) {
	        printf("%dº prod \n", i + 1);
	        for (j = 0; j < C; j++) {
	            printf("\tProduto %d \n", j + 1);
	            printf("\tEstoque: %d \n", prod[i][j]);
	            printf("\n");
	        }
	        printf("\tTotal de itens armazenados: %d", somaEstoque[i]);
	        printf("\n");
	    }

	    printf("Preços \n");
	    for (i = 0; i < C; i++) {
	        printf("\tValor produto %d: R$ %d. \n", i + 1, prod[L - 1][i]);
	    }

	    printf("Custos \n");
	    for (i = 0; i < L - 1; i++) {
	        printf("\tCusto %dº prod: R$ %d \n", i + 1, custo[i]);
	    }
	    
	    printf("\nO prod %d possui o menor estoque. \n", i + 1);
	    printf("O armaazem %d possui maior estoque produto 2. \n", maior_estoqueP2 + 1);

	}

}
