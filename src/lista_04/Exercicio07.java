package lista_04;
public class Exercicio07 {

	public static void main(String[] args) {

		System.out.println("\033[1;36m-- Lista 04 Exerciocio 07 --\033[0m");

		System.out.println("\033[1;32m--- RESULTADO ---\033[0m");

		int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		int somaNumeros = 0;

		for (int i = 0; i < numeros.length; i++) {

			somaNumeros += numeros[i];

		}

		System.out.println("A soma do conteu do vetor é " + somaNumeros);

	}
}

//210.
//(07) Escreva um algoritmo para receber um vetor A de tamanho 20 contendo números inteiros
//e imprimir a soma dos seus elementos.
