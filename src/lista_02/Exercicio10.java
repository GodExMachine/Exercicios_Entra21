package lista_02;
import java.util.Scanner;


public class Exercicio10 {

		public static void main(String[] args) {
			
			System.out.println("\033[1;36m-- Exercicio 10 lista 02--\033[0m");
		    
		    Scanner leitor = new Scanner(System.in);	 
		    
			System.out.print("Informe o saldo medio do ultimo ano: ");
			int saldoMedio  = leitor.nextInt();
			  		
			leitor.close();
				
			
			float valorCredito = 0;
			
			if(saldoMedio >= 0 && saldoMedio <= 200){
				
				
			}else if(saldoMedio >= 201 && saldoMedio <= 400){
				
				valorCredito = saldoMedio * 0.2f;
				
			}else if(saldoMedio >= 401 && saldoMedio <= 600) {
				
				valorCredito = saldoMedio * 0.3f;
				
			}else {
				valorCredito = saldoMedio * 0.4f;
			}
			
			 
			System.out.println("\033[1;32m-- RESULTADO--\033[0m");
					
			System.out.println("Saldo medio do ultimo ano R$"+saldoMedio);
			System.out.println("O credito é de R$"+valorCredito);
			
		
	 
	 
	 
		}
	}

/*

(10) Um banco concederá crédito especial aos seus clientes, 
variável dependente do saldo médio no último ano. Escreva um algoritmo para ler o saldo médio de um cliente e
 calcule o valor do crédito de acordo com a tabela abaixo. Mostre uma mensagem informando o saldo médio e o valor do crédito. 
 
	Saldo Médio 	Percentual
	
	de 0 a 200 	nenhum crédito
	
	de 201 a 400 	20% do valor do saldo médio
	
	de 401 a 600 	30% do valor do saldo médio
	
	acima de 601 	40% do valor do saldo médio



 */
