package lista_02;
import java.util.Scanner;


public class Exercicio11 {

		public static void main(String[] args) {
	
			System.out.println("\033[1;36m-- Exercicio 11 lista 02--\033[0m");
		    
		    Scanner leitor = new Scanner(System.in);	 
		    
			System.out.print("Informe o salario atual: ");
			float salarioInicial  = leitor.nextFloat();
		
			System.out.print("Informe o codigo do cargo: ");
			int codigoCargo  = leitor.nextInt();
			  		
			leitor.close();
				
			float aumento = 0;
			
			switch(codigoCargo) {
				case 101:
					aumento = 0.1f;
					break;
				case 102:
					aumento = 0.2f;
					break;
				case 103:
					aumento = 0.3f;
					break;
				default:
					aumento = 0.4f;
			}		
			
			float novoSalario = (salarioInicial * aumento) + salarioInicial; 		
			
			System.out.println("\033[1;32m-- RESULTADO--\033[0m");
						
			System.out.printf("Salario inicial: R$%.2f",salarioInicial);
			System.out.printf("\nAumento de: R$%.2f",(novoSalario-salarioInicial));
			System.out.printf("\nNovo salario: R$%.2f",novoSalario);

	 
		}
	}
/*
 (11) Escreva um algoritmo para ler o salário e o código do cargo de um funcionário e calcule o novo salário usando a tabela abaixo. 
 Se o cargo do funcionário não estiver na tabela, ele deverá, então, receber 40% de aumento. 
 Mostre o salário antigo, o novo salário e a diferença.
 
	Código	Cargo 	Percentual

	101 	Gerente 	10%
	
	102 	Engenheiro 	20%
	
	103 	Técnico 	30%

 */
 
