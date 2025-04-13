package lista_05;

public class Exercicio12 {

	public static void main(String[] args) {

		int[] vetorA = { 4, 5, 6, 7, 3, 10, 5 }; // 40

		System.out.println(somaVetor(vetorA));

	}

	
	
	
	public static int somaVetor(int[] valor) {

		int soma = 0;

		for (int i = 0; i < valor.length; i++) {

			soma += valor[i];

		}

		return soma;
	}

}

//(12) Escreva uma função para receber uma matriz A contendo números inteiros 
//e retornar a soma dos seus elementos.
