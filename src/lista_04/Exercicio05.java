package lista_04;
import java.util.Arrays;

public class Exercicio05 {

	public static void main(String args[]) {
			
		System.out.println("\033[1;36m-- Lista 04 Exerciocio 05 --\033[0m");
			
		System.out.println("\033[1;32m--- RESULTADO ---\033[0m");

		// 3, 4, 5, 6, 7, 8, 9
		int[] vetorA = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int[] vetorB = { 3, 7, 8, 4, 7, 6, 5, 5, 9, 5 };

		boolean[] jaContou = new boolean[vetorA.length];

		int tamanhoVetorC = 0;

		for (int i = 0; i < vetorA.length; i++) {

			if (jaContou[i] == false) {    // o teste pode ser assim tamben --> if (!jaContou[i])

				for (int j = 0; j < vetorB.length; j++) {

					if (vetorA[i] == vetorB[j]) {
						jaContou[i] = true;
						tamanhoVetorC++;
						break;
						
					}

				}
				

			}

		}
		
		

		int[] vetorC = new int[tamanhoVetorC];
		int posicaoC = 0;

		for (int i = 0; i < vetorA.length; i++) {

			if (jaContou[i] == true) {
				vetorC[posicaoC] = vetorA[i];
				posicaoC++;
			}

		}

		
		
		System.out.println(Arrays.toString(vetorC));
		
		

	}

}

/*
 * 
 * é
 * 
 * (05) Escreva um algoritmo para receber 2 vetores A e B de tamanho 10 contendo
 * números inteiros. Ao final do algoritmo, um vetor C deve ser criado contendo
 * a intersecção de A e B.
 * 
 * 
 * 
 */
