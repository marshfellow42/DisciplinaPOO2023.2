# Capítulo 6: Vetor

## Resolvidas

Questões | Enunciado
:---------: | :------:
04 | Faça um programa que preencha um vetor com oito números inteiros, calcule e mostre dois vetores resultantes. O primeiro vetor resultante deve conter os números positivos e o segundo, os números negativos. Cada vetor resultante vai ter, no máximo, oito posições, que não poderão ser completamente utilizadas.
07 | Faça um programa que, no momento de preencher um vetor com oito números inteiros, já os armazene de forma crescente.
12 | Faça um programa que preencha um vetor com os modelos de cinco carros (exemplos de modelos: Fusca, Gol, Vectra etc). Carregue outro vetor com o consumo desses carros, isto é, quantos quilômetros cada um deles faz com um litro de combustível. Calcule e mostre: <br/> ■■ o modelo de carro mais econômico; e <br/> ■■ quantos litros de combustível cada um dos carros cadastrados consome para percorrer uma distância de 1.000 km.
16 | Faça um programa que preencha um vetor com dez números inteiros e um segundo vetor com cinco números inteiros. Calcule e mostre dois vetores resultantes. O primeiro vetor resultante será composto pelos números pares, gerados pelo elemento do primeiro vetor somado a todos os elementos do segundo vetor; o segundo será composto pelos números ímpares gerados pelo elemento do primeiro vetor somado a todos os elementos do segundo vetor. <br/> <img src="https://github.com/marshfellow42/marshfellow42/blob/469c17f5c6280b4e538404839fe6a7cc40d25ca2/Assets/School%20Projects/DisciplinaPOO/Cap%2006/screen.jpg">
22 | Faça um programa que simule um controle bancário. Para tanto, devem ser lidos os códigos de dez contas e seus respectivos saldos. Os códigos devem ser armazenados em um vetor de números inteiros (não pode haver mais de uma conta com o mesmo código) e os saldos devem ser armazenados em um vetor de números reais. O saldo deverá ser cadastrado na mesma posição do código. Por exemplo, se a conta 504 foi armazenada na quinta posição do vetor de códigos, seu saldo deverá ficar na quinta posição do vetor de saldos. Depois de fazer a leitura dos valores, deverá aparecer o seguinte menu na tela: <br/> 1. Efetuar depósito <br/> 2. Efetuar saque <br/> 3. Consultar o ativo bancário, ou seja, o somatório dos saldos de todos os clientes <br/> 4. Finalizar o programa <br/> ■■ para efetuar depósito, deve-se solicitar o código da conta e o valor a ser depositado. Se conta não estiver cadastrada, deverá aparecer a mensagem Conta não encontrada e voltar ao menu. <br/>  Se a conta existir, atualizar seu saldo; <br/> ■■ para efetuar saque, deve-se solicitar o código da conta e o valor a ser sacado. Se a conta não estiver cadastrada, deverá aparecer a mensagem Conta não encontrada e voltar ao menu. Se a conta existir, verificar se o seu saldo é suficiente para cobrir o saque. (Estamos supondo que a conta não possa ficar com o saldo negativo.) Se o saldo for suficiente, realizar o saque e voltar ao menu. Caso contrário, mostrar a mensagem Saldo insuficiente e voltar ao menu; <br/> ■■ para consultar o ativo bancário, deve-se somar o saldo de todas as contas do banco. Depois de mostrar esse valor, voltar ao menu; <br/> ■■ o programa só termina quando for digitada a opção 4 — Finalizar o programa.

# Capítulo 7: Matriz

## Resolvidas

Questões | Enunciado
:---------: | :------:
04 | Crie um programa que preencha uma matriz 10 x 20 com números inteiros e some cada uma das linhas, armazenando o resultado das somas em um vetor. A seguir, o programa deverá multiplicar cada elemento da matriz pela soma da linha correspondente e mostrar a matriz resultante.
15 | Elabore um programa que preencha: <br/> ■■ um vetor com cinco números inteiros; <br/> ■■ outro vetor com dez números inteiros; <br/> ■■ uma matriz 4 x 3, também com números inteiros. <br/> O programa deverá calcular e mostrar: <br/> ■■ o maior elemento do primeiro vetor multiplicado pelo menor elemento do segundo vetor. O resultado dessa multiplicação, adicionado aos elementos digitados na matriz, dará origem a uma segunda matriz (resultante); <br/> ■■ a soma dos elementos pares de cada linha da matriz resultante; <br/> ■■ a quantidade de elementos entre 1 e 5 em cada coluna da matriz resultante.
18 | Crie um programa que leia um vetor vet contendo 18 elementos. A seguir, o programa deverá distribuir esses elementos em uma matriz 3 × 6 e, no final, mostrar a matriz gerada. <br/> <img src="https://github.com/marshfellow42/marshfellow42/blob/0afe901ef4af89718222c29dd4bd402142dfe579/Assets/School%20Projects/DisciplinaPOO/Cap%2007/screen.jpg" >
20 | Crie um programa que utilize uma matriz com dimensões máximas de cinco linhas e quatro colunas e solicite que sejam digitados os números (desordenadamente), armazenando-os, ordenadamente, na matriz. <br/> Observe o exemplo que se segue. <br/> Supondo que sejam digitados os seguintes números: <br/> **10 – 1 – 2 – 20 – 30 – 17 – 98 – 65 – 24 – 12 – 5 – 8 – 73 – 55 – 31 – 100 – 120 – 110 – 114 – 130**,  estes deverão ser armazenados na matriz da seguinte maneira: <br/> <img src="https://github.com/marshfellow42/marshfellow42/blob/69dd9ac3628f36bb87c50403208322d2d77681cc/Assets/School%20Projects/DisciplinaPOO/Cap%2007/screen2.jpg">
22 | Faça um programa que receba o estoque atual de três produtos, armazenados em quatro armazéns, e coloque esses dados em uma matriz 5 x 3. Considerando que a última linha dessa matriz contenha o custo de cada produto, o programa deverá calcular e mostrar: <br/> ■■ a quantidade de itens quadrados em cada armazém; <br/> ■■ qual armazém possui maior estoque do produto 2; <br/> ■■ qual armazém possui menor estoque; <br/> ■■ qual o custo total de cada produto; <br/> ■■ qual o custo total de cada armazém. <br/> Devem ser desconsiderados empates.

# Capítulo 8: Sub-rotina 

## Resolvidas

Questões | Enunciado
:---------: | :------:
15 | Faça uma sub-rotina que receba como parâmetro um vetor A com cinco números reais e retorne esses números ordenados de forma crescente.
18 | Crie uma sub-rotina que receba como parâmetro uma matriz A(6,6) e retorne o menor elemento de sua diagonal secundária.
20 |Crie uma sub-rotina que receba como parâmetro uma matriz A(12,12) e retorne a média aritmética dos elementos abaixo da diagonal principal.
22 | Crie um programa que carregue um vetor com oito números inteiros, calcule e mostre dois vetores resultantes. O primeiro vetor resultante deverá conter os números positivos e o segundo, os números negativos. Cada vetor resultante terá no máximo oito posições, e nem todas serão obrigatoriamente utilizadas.
23 | Crie um programa que carregue uma matriz 3X4 com números reais. Utilize uma função para copiar todos os valores da matriz para um vetor de 12 posições. Esse vetor deverá ser mostrado no programa principal.
