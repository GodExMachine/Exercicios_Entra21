package lista_04;
public class Exercicio01 {

	public static void main(String args[]) {
		
		
		System.out.println("\033[1;36m-- Lista 04 Exerciocio 01 --\033[0m");
				
		System.out.println("\033[1;32m--- RESULTADO ---\033[0m");

		int[] numerosPares = new int[100];
	

		for (int i = 0; i < numerosPares.length; i++) {
			
			
				numerosPares[i] = i * 2;
		
			
			
			
		}
		
		
		
		for(int i = 0; i < 100 ;i++) {
			
			System.out.println(numerosPares[i]);
			
			
		}

			
			
			
			
	}

}

/*
 * 
 * Escreva um algoritmo para criar e popular um vdetor com os 100 primeiros
 * numeros pares
 * 
 * 
 * 
 * 
 * 
 * 
 */