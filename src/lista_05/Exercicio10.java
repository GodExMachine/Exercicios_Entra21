package lista_05;

public class Exercicio10 {

	public static void main(String args[]) {

		int vetorA[] = { 1, 2, 3, 4, 5, 6, 7, 10 };

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println(listaFatorial(vetorA)[i]);

		}

	}
	
	public static int[] listaFatorial(int[] valor) {

		int[] vetorSaida = new int [valor.length];
		
		for(int i = 0; i < valor.length;i ++) {
			
			vetorSaida[i] = verificaFatorial(valor[i]);
			
		}
		
		return vetorSaida;
		

	}
	
	public static int verificaFatorial(int valor) {

		int fatorial = 1;

		for (int i = 0; i < valor; i++) {

			fatorial += fatorial * i;

		}

		return fatorial;

	}
	
	
	
}


//(10) Escreva uma função para receber um vetor A de números inteiros.
//A função deve retornar um vetor contendo o fatorial de cada elemento do vetor A. 

