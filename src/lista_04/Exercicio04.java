package lista_04;
import java.util.Arrays;

public class Exercicio04 {

	public static void main(String args[]) {
			
		System.out.println("\033[1;36m-- Lista 04 Exerciocio 04 --\033[0m");
		
		System.out.println("\033[1;32m--- RESULTADO ---\033[0m");

		int[] vetorA = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int[] vetorB = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		int[] vetorC = new int[vetorA.length + vetorB.length];


		for (int i = 0; i < vetorA.length; i++) {

			vetorC[i] = vetorA[i];
			vetorC[i +vetorA.length] = vetorB[i];

		}

	
		


			System.out.println(Arrays.toString(vetorC));

		

	}
}

/*
 * 
 * (04) Escreva um algoritmo para receber 2 vetores A e B de tamanho 10 contendo
 * números inteiros. Ao final do algoritmo, um vetor C deve ser criado contendo
 * a união de A e B.
 * 
 * 
 * 
 */
