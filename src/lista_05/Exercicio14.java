package lista_05;

public class Exercicio14 {
	

	public static void main(String[] args) {

		int[][] matrizA = {
				{ 6, 5, 5, 1, 5 },
				{ 2, 7, 2, 5, 2 },
				{ 8, 2, 3, 5, 1 },
				{ 8, 8, 8, 2, 5 },
				{ 1, 6, 3, 4, 5 }, // diagonal principal menor valor 2

		};

		System.out.println(menorValorDiagonalPrincipal(matrizA));

	}

	public static int menorValorDiagonalPrincipal(int[][] valor) {

		int menorValor = Integer.MAX_VALUE;

		for (int i = 0; i < valor.length; i++) {

			menorValor = valor[i][i] < menorValor ? valor[i][i] : menorValor;

		}

		return menorValor;
	}

	
	

}


//(14) Escreva uma função para receber uma matriz A contendo números inteiros 
//e retornar o menor elemento da sua diagonal principal.
