package lista_04;
public class Exercicio02 {

	public static void main(String args[]) {
		
		System.out.println("\033[1;36m-- Lista 04 Exerciocio 02 --\033[0m");
		
		System.out.println("\033[1;32m--- RESULTADO ---\033[0m");

		int[] numerosPrimos = new int[10];

		int posicao = 0;

		boolean primoVerdade = true;

		int inicial = 2;

		while (posicao < 10) {

			primoVerdade = true;

			for (int i = 2; i < inicial; i++) {

				if (inicial % i == 0) {
					primoVerdade = false;
					break;

				}

			}

			if (primoVerdade) {
				numerosPrimos[posicao] = inicial;
				posicao++;
			}

			inicial++;

		}

		for (int i = 0; i < 10; i++) {

			System.out.println(numerosPrimos[i]);

		}

	}

}

/*
 * 2, 3, 5, 7, 11, 13, 17, 19 23 e 29
 * 
 * 
 * (02) Escreva um algoritmo para criar e popular um vetor com os 10 primeiros
 * números primos.
 * 
 * 
 * 
 */