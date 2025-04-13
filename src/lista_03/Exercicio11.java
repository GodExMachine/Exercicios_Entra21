package lista_03;
import java.util.Scanner;

public class Exercicio11 {

	public static void main(String args[]) {
	
			System.out.println("\033[1;36m-- Lista 03 Exerciocio 11--\033[0m");
			
			Scanner leitor = new Scanner(System.in);
		
			System.out.print("Informe um valor inteiro e positivo: ");
			int valorEntrada = leitor.nextInt();
			leitor.close();
			
			valorEntrada++;
			
			int quantidadePerfeita = 0;
			
		
			while(quantidadePerfeita <= 1) {
			    
			int resultadoP = 0;
							
				for(int i = 1 ; i < valorEntrada ; i++) {
					
					if(valorEntrada % i == 0 ) {
						resultadoP += i;
						
					}
				}
				
				
				if(valorEntrada == resultadoP){
					System.out.println("\033[1;32m-- RESULTADO--\033[0m");
				    System.out.println("O proximo numero perfeito é: "+resultadoP);
			    	break;
				}
				
				
			valorEntrada++;
				
			}
				
				
	

	}
	
}

//(11) Escreva um algoritmo para ler um número inteiro e 
//positivo e informar qual o próximo número perfeito a partir dele.


