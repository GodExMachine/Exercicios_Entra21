package lista_04;
public class Exercicio16 {

	public static void main(String args[]) {

		System.out.println("\033[1;36m-- Lista 04 Exerciocio 16_v2 --\033[0m");

		System.out.println("\033[1;32m--- RESULTADO ---\033[0m"+"\n");

		int[][] matrizA = {
				{ 2, 5, 5, 5 }, 
				{ 5, 5, 5, 5 },
				{ 5, 5, 5, 5 }, 
				{ 5, 5, 5, 5 },		
				};
		
		int[][] matrizB = {
				{ 1, 2, 3, 4 }, 
				{ 2, 2, 2, 2 },
				{ 2, 2, 2, 2 }, 
				{ 2, 2, 2, 2 },		
				};
		
		int[][] matrizC = new int[4][4];
		
		for (int i = 0; i < matrizA.length; i++) { 
			
		    for (int j = 0; j < matrizA[i].length; j++) {     	

		        for (int k = 0; k < matrizB.length; k++) { 
		        	
		            matrizC[i][j] += matrizA[i][k] * matrizB[k][j]; 
		            
		        }
		    }
		}
		
		
		
		
		
		
		
		
		
		for (int i = 0; i < matrizC.length; i++) {
			for (int j = 0; j < matrizC[i].length; j++) {

				System.out.print(matrizC[i][j] + " ");
			}
			System.out.println();
		}

	}
}

//(16) Escreva um algoritmo para receber duas matrizes A(4,4) e B(4,4) 
//e retornar a matriz C que seja o produto matricial de A por B.



