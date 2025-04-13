package lista_03;


public class Exercicio08 {

	
	public static void main(String args[]) {
		
		System.out.println("\033[1;36m-- Lista 03 Exerciocio 08-\033[0m");
		

		
		
		System.out.println("\033[1;32m-- RESULTADO--\033[0m");
		
		int resultado = 1;
		
		boolean primoVerdade = true;
		
		for(int i = 92 ; i <= 107 ; i++ ) {
			
			primoVerdade = true;
		
			for(int j = 2 ; j < i ; j++) {
							
				if(i % j == 0) {
					primoVerdade = false;
					break;
				}
								
			}	
				
			if (primoVerdade) {
               // System.out.println(i);
                resultado *= i;
            }
			
		

		}
		
				//107972737
		System.out.println("A soma dos numeros primos entre 92 e 107 é: "+resultado);
		
	
	}
}

//														soma
//(08) Escreva um algoritmo para calcular e escrever o produtório dos números primos entre 92 e 107.

