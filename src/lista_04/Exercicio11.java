package lista_04;
public class Exercicio11 {

	public static void main(String args[]) {

		System.out.println("\033[1;36m-- Lista 04 Exerciocio 11 --\033[0m");

		System.out.println("\033[1;32m--- RESULTADO ---\033[0m");

		int[] vetorA = { 1, 20, 3, 4, 55, 67, 7, 80, 9, 10, 10, 12, 13, 14, 15 }; // 80

		int maiorValor = Integer.MIN_VALUE;

		for (int i = 0; i < vetorA.length; i++) {

			maiorValor = vetorA[i] > maiorValor ? vetorA[i] : maiorValor;

		}

		System.out.println(maiorValor);

	}
}

//(11) Escreva um algoritmo para receber um vetor A de tamanho 15 contendo números inteiros 
//e imprimir o maior valor do vetor.
