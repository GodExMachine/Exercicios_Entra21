package lista_05;

public class Exercicio11 {

	public static void main(String args[]) {

		int[] vetorA = { 1, 2, 3, 4, 10, 5, 4, 7, 8 };

		System.out.println(verificaMaior(vetorA));

	}

	public static int verificaMaior(int[] valor) {

		int maiorValor = Integer.MIN_VALUE;

		for (int i = 0; i < valor.length; i++) {

			maiorValor = valor[i] > maiorValor ? valor[i] : maiorValor;

		}

		return maiorValor;

	}

}

//(11) Escreva uma função para receber um vetor A de números inteiros e retornar o maior valor do vetor.
