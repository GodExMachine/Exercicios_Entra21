package lista_04;
public class Exercicio18 {
	
	public static void main(String args[]) {

		System.out.println("\033[1;36m-- Lista 04 Exerciocio 18 --\033[0m");

		System.out.println("\033[1;32m--- RESULTADO ---\033[0m");
		
		
		int[][] matrizA = {
				{ 5, 5, 5, 5, 7, 5, 5, 5, 5  }, //47 impar
				{ 5, 5, 5, 5, 5, 5, 5, 5, 5  }, //45 par
				{ 5, 5, 5, 5, 7, 5, 5, 5, 5  }, //47 impar
				{ 5, 5, 5, 5, 5, 5, 5, 5, 5  },	//45 par
				{ 5, 5, 5, 5, 7, 5, 5, 5, 5  },	//47 impar
				{ 5, 5, 5, 5, 5, 5, 5, 5, 5  },	//45 par
				{ 5, 5, 5, 5, 7, 5, 5, 5, 5  },	//47 impar
				{ 5, 5, 5, 5, 5, 5, 5, 5, 5  },	//45 par
				{ 5, 5, 5, 5, 7, 5, 5, 5, 5  },	//47 impar
				};
		
		int somaPares = 0; //180 <-- verificar com professor se é considerar a linha 1 como a linha 0 entao seria maior o valor
		int	posicaoLinha = 1;
		
		for (int i = 0; i < matrizA.length; i++) {

			for (int j = 0; j < matrizA[i].length; j++) {
				
				if(posicaoLinha % 2 == 0) {
					somaPares += matrizA[i][j];
					
				}
				
			
			}
			posicaoLinha++;
		}
		
		System.out.println(somaPares);
		
		
		
		
	}
}


//(18) Escreva um algoritmo para receber uma matriz A(9,9) de reais 
//e imprimir a soma dos elementos das linhas pares de A.
