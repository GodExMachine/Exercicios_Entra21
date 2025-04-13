package lista_04;
public class Exercicio10 {

	public static void main(String args[]) {
		
		System.out.println("\033[1;36m-- Lista 04 Exerciocio 10 --\033[0m");

		System.out.println("\033[1;32m--- RESULTADO ---\033[0m");

		int[] vetorA = { 7, 2, 3, 4, 5, 6, 7, 8, 1, 10 }; // 7, 2, 3, 5, 7

		int quantidadePrimos = 0;

		for (int i = 0; i < vetorA.length; i++) {

			boolean primoVerdade = true;

			if (vetorA[i] == 1) {
				primoVerdade = false;
			}

			for (int j = 2; j < vetorA[i]; j++) {

				if (vetorA[i] % j == 0) {
					primoVerdade = false;
					break;
				}
			}

			if (primoVerdade) {

				quantidadePrimos++;
			}

		}

		int[] vetorB = new int[quantidadePrimos];

		int posicao = 0;

		for (int i = 0; i < vetorA.length; i++) {

			boolean primoVerdade = true;

			if (vetorA[i] == 1) {
				primoVerdade = false;
			}

			for (int j = 2; j < vetorA[i]; j++) {

				if (vetorA[i] % j == 0) {
					primoVerdade = false;
					break;
				}

			}

			if (primoVerdade) {

				vetorB[posicao] = vetorA[i];
				posicao++;
			}

		}

		for (int i = 0; i < vetorB.length; i++) {
			System.out.println(vetorB[i]);

		}

	}
}

//(10) Escreva um algoritmo para receber um vetor A de tamanho 10 contendo números inteiros. 
//O algoritmo deve gerar um vetor B e o popular com os números primos do vetor A.
