package lista_04;
public class Exercicio20 {

	public static void main(String args[]) {

		System.out.println("\033[1;36m-- Lista 04 Exerciocio 20 --\033[0m");

		System.out.println("\033[1;32m--- RESULTADO ---\033[0m" + "\n");

		int[][] matrizA = {
			    {14, 7, 3, 13, 19, 7, 18, 12, 14, 15, 15, 18}, // 155
			    {8, 0, 4, 1, 7, 13, 18, 20, 11, 16, 16, 3},    // 117
			    {1, 16, 16, 18, 8, 14, 6, 3, 8, 10, 9, 20},    // 129
			    {20, 4, 14, 17, 7, 18, 0, 9, 7, 7, 19, 14},    // 136
			    {4, 16, 12, 3, 10, 19, 1, 6, 13, 4, 4, 2},     // 94
			    {11, 12, 9, 7, 7, 0, 14, 4, 1, 17, 16, 0},     // 98
			    {14, 7, 6, 11, 2, 20, 12, 13, 17, 1, 11, 7},   // 121
			    {2, 11, 19, 4, 4, 7, 19, 11, 8, 2, 6, 5},      // 98
			    {19, 15, 4, 12, 3, 16, 0, 6, 14, 20, 18, 20},  // 147
			    {19, 6, 13, 1, 15, 7, 9, 7, 1, 19, 3, 6},      // 106
			    {12, 16, 8, 11, 3, 17, 17, 19, 18, 11, 14, 17}, // 163
			    {18, 16, 11, 18, 19, 18, 6, 16, 12, 15, 15, 10} // 174
			};
	
		int[] vetorB = new int[matrizA.length];

		for (int i = 0; i < matrizA.length; i++) {
		
			int soma = 0;

			for (int j = 0; j < matrizA[i].length; j++) {

				soma += matrizA[i][j];
				
			}
			vetorB[i] = soma;
		}
		
		
		
		
		for (int i = 0; i < vetorB.length; i++) {
		
			System.out.println(vetorB[i]);
		}
		
		
	
	}
}


//(20) Escreva um algoritmo para receber uma matriz A(12,12).
//O algoritmo deve somar cada linha de A e armazenar em um vetor B.
