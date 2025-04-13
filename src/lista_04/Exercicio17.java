package lista_04;
public class Exercicio17 {

	public static void main(String args[]) {

		System.out.println("\033[1;36m-- Lista 04 Exerciocio 17 --\033[0m");

		System.out.println("\033[1;32m--- RESULTADO ---\033[0m");
	
	
	int[][] matrizA = {
			{ 2, 5, 5, 5 }, 
			{ 5, 5, 5, 5 },
			{ 5, 7, 7, 5 }, 
			{ 5, 5, 5, 5 },		
			};
	
	int[][] matrizB = {
			{ 2, 2, 2, 2 }, 
			{ 2, 2, 2, 2 },
			{ 2, 7, 7, 2 }, 
			{ 2, 2, 2, 2 },		
			};
	
	int[][] matrizC = new int [4][4];
	
	
	for (int i = 0; i < matrizA.length; i++) {

		for (int j = 0; j < matrizA[i].length; j++) {

			matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
			
		
		}
	}
	
	
	
	for (int i = 0; i < matrizC.length; i++) {

		for (int j = 0; j < matrizC[i].length; j++) {

			System.out.print(matrizC[i][j]+" ");
			
		
		}
		System.out.println();
	}
	
	
	}
}

//17) Escreva um algoritmo para receber duas matrizes A(4,4) e B(4,4) 
//e retornar a matriz C que seja a soma de A com B.
