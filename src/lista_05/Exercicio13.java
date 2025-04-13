package lista_05;

public class Exercicio13 {

	public static void main(String[] args) {

		int[][] matrizA = {
				{ 1, 2, 3, 4, 5 },
				{ 2, 2, 2, 2, 2 },
				{ 1, 2, 3, 4, 5 },
				{ 2, 2, 2, 2, 2 },
				{ 1, 2, 3, 4, 5 }, // diagonal principal soma 13

		};

		System.out.println(somaDiagonalPrincipal(matrizA));

	}

	public static int somaDiagonalPrincipal(int[][] valor) {

		int soma = 0;

		for (int i = 0; i < valor.length; i++) {

			soma += valor[i][i];

		}

		return soma;
	}

}

//(13) Escreva uma função para receber uma matriz A contendo números inteiros
///e retornar a soma dos elementos da diagonal principal.
