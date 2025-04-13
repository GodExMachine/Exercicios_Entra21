package lista_04;
public class Exercicio13 {
	
	public static void main(String args[]) {
		
		System.out.println("\033[1;36m-- Lista 04 Exerciocio 13 --\033[0m");

		System.out.println("\033[1;32m--- RESULTADO ---\033[0m");

		int[][] matrizA = { 
				{ 1, 2, 3, 4, 5 },
				{ 6, 7, 5, 9, 1 }, 
				{ 4, 9, 8, 7, 10 },
				{ 3, 0, 1, 92, 15 },
				{ 8, 6, 7, 5, 13 } 
				};

		int soma = 0;


		for (int i = 0; i < matrizA.length; i++) {

			soma += matrizA[i][i];
		
		}

		System.out.println(soma);
		
		
	}
}

//(13) Escreva um algoritmo para receber uma matriz A(5,5) contendo números inteiros 
//e imprimir a soma do elementos da diagonal principal.
