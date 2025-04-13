package lista_04;
public class Exercicio06 {

	public static void main(String[] args) {

		System.out.println("\033[1;36m-- Lista 04 Exerciocio 06 --\033[0m");

		System.out.println("\033[1;32m--- RESULTADO ---\033[0m");

		int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }; // 7 pares

		int quantidadePares = 0;

		for (int i = 0; i < numeros.length; i++) {

			if (numeros[i] % 2 == 0) {

				quantidadePares++;

			}

		}

		System.out.println("O vetor numeros contem " + quantidadePares + " numeros pares.");

	}
}

//(06) Escreva um algoritmo para receber um vetor A 
//de tamanho 15 contendo números inteiros e imprimir a quantidade de valores pares.