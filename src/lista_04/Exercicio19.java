package lista_04;
public class Exercicio19 {

	public static void main(String args[]) {

		System.out.println("\033[1;36m-- Lista 04 Exerciocio 19 --\033[0m");

		System.out.println("\033[1;32m--- RESULTADO ---\033[0m"+"\n");

		int[][] matrizA = {
				{ 5, 5, 5, 5 }, 
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

			for (int j = 0; j < matrizB[i].length; j++) {

				matrizC[i][j]  = matrizA[i][j] * matrizB[i][j];
				
				
				
				
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


//(19) Escreva um algoritmo para receber uma matriz A(6,6)
//e um valor B. O algoritmo deve multiplicar cada elemento de A por B e armazenar em um vetor C.

