//import java.util.Arrays;
package lista_05;

public class Exercicio09 {

	public static void main(String args[]) {
		
		
		
		
//		System.out.print(Arrays.toString(progresaoAritimetica(5,10,1)));
		
	
		for (int i = 0; i < progresaoAritimetica(5,10,1).length; i++) {
			
		System.out.print(progresaoAritimetica(5,10,1)[i]+" ");
		
		}
		
	}
	
	
	
	
	

	public static int[] progresaoAritimetica(int repeticao, int valorInicial, int razao) {

		int[] termos = new int[repeticao];
		
		for (int i = 0; i < repeticao; i++) {

			valorInicial += razao;

			termos[i] = valorInicial;
		}
		
		
		
		return termos;
		
	}
	
	
	
	
	

}

//(09) Escreva uma função para receber um número n

//(número de termos de uma progressão aritmética),

//a1 (o primeiro termo da progressão) e r 

//(a razão da progressão) e retornar os n termos desta progressão.
