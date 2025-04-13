package lista_04;
public class Exercicio15 {
	
	public static void main(String args[]) {

		System.out.println("\033[1;36m-- Lista 04 Exerciocio 15 --\033[0m");

		System.out.println("\033[1;32m--- RESULTADO ---\033[0m");

		int[][] matrizA = {
				{ 7, 5, 3, 4, 5 }, 
				{ 6, 7, 5, 9, 11 },
				{ 4, 9, 1, 7, 10 }, 
				{ 3, 7, 5, 9, 15 },
				{ 8, 6, 7, 5, 13 } 
				};
		
		
		int menorValor= Integer.MAX_VALUE;

		for (int i = 0; i < matrizA.length; i++) {

			menorValor = matrizA[i][i] < menorValor ? matrizA[i][i] : menorValor;

		}
		
		
		
		System.out.println(menorValor);
		
		

	}
}

//(15) Escreva um algoritmo para receber uma matriz A(5,5) contendo números inteiros 
//e imprimir o menor elemento da sua diagonal principal.
