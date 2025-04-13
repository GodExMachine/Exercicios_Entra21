package lista_03;

public class Exercicio10 {

	public static void main(String args[]) {
	
			System.out.println("\033[1;36m-- Lista 03 Exerciocio 10-\033[0m");
			System.out.println("\033[1;32m-- RESULTADO--\033[0m");
			
			
			int valorEntrada = 2;

			int quantidadePerfeita = 0;
			
		
			while(quantidadePerfeita <= 4) {
			    
			int resultadoP = 0;
							
				for(int i = 1 ; i < valorEntrada ; i++) {
					
					if(valorEntrada % i == 0 ) {
						resultadoP += i;
						
					}
				}
				
				
				if(valorEntrada == resultadoP){
					
				    System.out.println(resultadoP);
			    	quantidadePerfeita++;
				}
				
				
			valorEntrada++;
				
			}
				
				
	

	}
	
}
// dica fazer so os 4 primeiros pois o 5 ficaria pra sempre calculando é um numero enorme.
//(10) Escreva um algoritmo para gerar e escrever os 5 primeiros números perfeitos. 
//Um número perfeito é aquele que é igual a soma dos seus divisores (6 = 1 + 2 + 3 e 28 = 1 + 2 + 4 + 7 + 14).
