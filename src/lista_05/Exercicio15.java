package lista_05;

public class Exercicio15 {

	public static void main(String[] args) {

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

		
		for (int i = 0; i < produtoMatriarcal(matrizA, matrizB).length; i++) {

			for (int j = 0; j < produtoMatriarcal(matrizA, matrizB)[i].length; j++) {

				System.out.print(produtoMatriarcal(matrizA, matrizB)[i][j] + " ");

			}

			System.out.println("\n");

		}
		
		
	}
	
	
	public static int[][] produtoMatriarcal(int[][] matriz1, int[][] matriz2) {
		
		int[][] matrizSaida = new int[4][4];

		for (int i = 0; i < matriz1.length; i++) {

			for (int j = 0; j < matriz1[i].length; j++) {

				for (int k = 0; k < matriz2.length; k++) {

					matrizSaida[i][j] += matriz1[i][k] * matriz2[k][j];

				}
			}
			
			
			
		}
		
		return matrizSaida;
		
	}
	
	
	
	
	
	
	
}




//(15) Escreva uma função para receber duas matrizes A e B 
//e retornar a matriz C que seja o produto matricial de A por B.
