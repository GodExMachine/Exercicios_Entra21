package lista_04;
public class Exercicio03 {

	public static void main(String args[]) {
		
		
		System.out.println("\033[1;36m-- Lista 04 Exerciocio 03 --\033[0m");
		
		System.out.println("\033[1;32m--- RESULTADO ---\033[0m");


		int[] vetorA = { 5, 10, 3, 4, 5, 6, 7, 2, 1, 10 };
		int[] vetorB = new int[10];

		for (int i = 0; i < 10; i++) {

			for (int j = 0; j <= vetorA[i]; j++) {

				int fatorial = 1;

				for (int k = 0; k < j; k++) {

					fatorial += fatorial * k;

				}

				vetorB[i] = fatorial;

			}

		}

		for (int i = 0; i < 10; i++) {

			System.out.println(vetorB[i]);

		}

	}

}

/*
  
  (03) Escreva um algoritmo para receber 2 vetores A e B de tamanho 10 contendo
  números inteiros. Ao final do algoritmo, o vetor B deve conter o fatorial de
  cada elemento do vetor A.
  
1!  = 1
2!  = 2
3!  = 6
4!  = 24
5!  = 120
6!  = 720
7!  = 5.040
8!  = 40.320
9!  = 362.880
10! = 3.628.800

 
 */