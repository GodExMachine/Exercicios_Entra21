package lista_04;

public class Exercicio08 {

	public static void main(String args[]) {

		System.out.println("\033[1;36m-- Lista 04 Exerciocio 08 --\033[0m");
		
		System.out.println("\033[1;32m--- RESULTADO ---\033[0m");
		
		int[] vetorA = { 7, 14, 3, 4, 17, 6, 1, 20, 9, 10, 18, 12, 19, 2, 15, 16, 5, 11, 13, 8 };

		for (int i = 0; i < vetorA.length - 1; i++) {

			int guardaValor = 0;

			for (int j = 0; j < vetorA.length - 1; j++) {

				if (vetorA[j] > vetorA[j + 1]) {

					guardaValor = vetorA[j];

					vetorA[j] = vetorA[j + 1];

					vetorA[j + 1] = guardaValor;

				}

			}

		}

		
		
		
		
		for (int i = 0; i < vetorA.length; i++) {

			System.out.println(vetorA[i]);
		}

		
		
	}

}

//(08) Escreva um algoritmo para receber um vetor A de tamanho 20 contendo números inteiros 
//e ordená-lo em ordem crescente.
