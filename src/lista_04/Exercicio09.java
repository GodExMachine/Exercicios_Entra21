package lista_04;

public class Exercicio09 {

	public static void main(String args[]) {

		System.out.println("\033[1;36m-- Lista 04 Exerciocio 09 --\033[0m");

		System.out.println("\033[1;32m--- RESULTADO ---\033[0m");

		int[] vetorA = { 14, 2, 17, 4, 5, 12, 7, 15, 9, 19 };

		int[] vetorB = { 0, 18, 3, 11, 16, 6, 13, 8, 1, 10 }; // os dois juntos vao de 0 a 19

		int[] vetorC = new int[vetorA.length + vetorB.length];

		int posicao = 0;

		int guardaValor = 0;

		for (int i = 0; i < vetorA.length; i++) {

			vetorC[i] = vetorA[i];

		}

		for (int i = vetorA.length; i < vetorC.length; i++) {

			vetorC[i] = vetorB[posicao];

			posicao++;
		}

		for (int i = 0; i < vetorC.length; i++) {

			for (int j = 0; j < vetorC.length - 1; j++) {

				if (vetorC[j] < vetorC[j + 1]) {

					guardaValor = vetorC[j];
					vetorC[j] = vetorC[j + 1];
					vetorC[j + 1] = guardaValor;

				}

			}

		}
		
		
		
		
		
		

		for (int i = 0; i < vetorC.length; i++) {

			System.out.println(vetorC[i]);

		}

	}

}

//(09) Escreva um algoritmo para receber 2 vetores A e B de tamanho 10 contendo números inteiros.
//Ao final do algoritmo, um vetor C deve ser criado contendo a união de A e B em ordem decrescente.