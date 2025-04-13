package lista_02;
import java.util.Scanner;

public class Exercicio15 {

		public static void main(String[] args) {
			System.out.print("\033[1;36m");
			System.out.println("-- Exercicio 15 lista 02--");
			System.out.print("\033[0m");
		    
		    Scanner leitor = new Scanner(System.in);	 
		    
			System.out.print("Informe o indice de poluição: ");
			float indiceP  = leitor.nextFloat();
				  		
			leitor.close();
			
		
			boolean grupo1 = indiceP >= 0.3;
		
			boolean grupo2 = indiceP >= 0.4 && indiceP <= 0.5;
			
			boolean grupo3 = indiceP >= 0.5;
			
			
			System.out.print("\033[1;32m");
			System.out.println("-- RESULTADO--");
			System.out.print("\033[0m");
			
			
			if(grupo3) {
				System.out.println("Empresas do primeiro grupo devem ser notificadas ");
				System.out.println("Empresas do segundo grupo devem ser notificadas ");
				System.out.println("Empresas do terceiro grupo devem ser notificadas ");
				System.out.println("\033[1;31mSITUAÇÃO CRITICA \nPARALIZAÇÃO IMEDIATA");
			}else if(grupo2){
				System.out.println("Empresas do primeiro grupo devem ser notificadas ");
				System.out.println("Empresas do segundo grupo devem ser notificadas ");
				System.out.println("\033[1;33mALERTA RISCO MODERADO.");
			}else if(grupo1) {
				System.out.println("Empresas do primeiro grupo devem ser notificadas ");
				System.out.println("\033[1;37mRISCO AMENO.");
			}else {
				System.out.println("\033[1;36mINDICE DE POLUIÇÃO DENTRO DO ACEITAVEL.");
			}
			
			

		
	}
}
/*

(15) O departamento que controla o índice de poluição do meio ambiente mantém três grupos iniciode indústrias que são altamente poluentes.
 O índice de poluição aceitável varia de 0,05 até 0,25.
  
 Se o índice sobe para 0,3 as indústrias do primeiro grupo são intimadas a suspenderem suas atividades.
  
 Caso o índice cresce para 0,4 as empresas do primeiro e segundo grupo são intimadas a suspenderem suas atividades. 
 
 Por fim, se o índice atingir 0,5 todos os três grupos devem ser notificados a paralisarem suas atividades. 
 
 Escreva um algoritmo para ler o índice de poluição medido e emitir a notificação adequada aos diferentes grupos de empresas.

 */
 
