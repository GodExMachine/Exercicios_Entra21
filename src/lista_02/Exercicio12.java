package lista_02;
import java.util.Scanner;


public class Exercicio12 {

		public static void main(String[] args) {

		    Scanner leitor = new Scanner(System.in);	 
		    
			System.out.println("\033[1;36m-- Exercicio 12 lista 02--\033[0m");
		
			System.out.print("Informe o valor A: ");
			float valorA  = leitor.nextInt();
			  		
			System.out.print("Informe o valor B: ");
			float valorB  = leitor.nextInt();
			
			System.out.print("Informe o valor C: ");
			float valorC  = leitor.nextInt();
			
			System.out.print("Digite \033[1;36m1\033[0m para \033[1;36mCRESENTE\033[0m ou \033[1;31m2\033[0m para \033[1;31mDECRESENTE\033[0m: ");
			int ordem  = leitor.nextInt();
			
			leitor.close();

			//aqui eu vejo qual é o maior
			boolean aMaior = valorA >= valorB && valorA >= valorC;
			boolean bMaior = valorB >= valorA && valorB >= valorC;
			
			//aqui eu vejo qual é o menor
			boolean aMenor = valorA < valorB && valorA < valorC;
			boolean bMenor = valorB < valorA && valorB < valorC;
			
						
			float primeiro = 0;
			float segundo = 0;
			float terceiro = 0;
			
			if(aMaior) {
				 terceiro = valorA;	
					 if(bMenor) {
						 segundo = valorC;
						 primeiro = valorB;
					 }else {
						 segundo = valorB;
						 primeiro = valorC;
						 
					 }
					 
			}else if(bMaior) {
				 terceiro = valorB;	
					 if(aMenor) {
						 segundo = valorC;
						 primeiro = valorA;
						 
					 }else {
						 segundo = valorA;
						 primeiro = valorC;
						 
					 }
		 
				      
			}else{
				terceiro = valorC;					
				if(valorA >= valorB) {
					segundo = valorA;
					primeiro = valorB;		
				}else {
					segundo = valorB;
					primeiro = valorA;
				}
				
				
			}
				
			System.out.println("\033[1;32m-- RESULTADO--\033[0m");
					
			
			switch(ordem) {
			
				case 1:
					System.out.println("Ordem \033[1;36mCRESENTE\033[0m");
					System.out.println("Primeiro valor: "+primeiro);
					System.out.println("Segundo valor: "+segundo);
					System.out.println("teceiro valor: "+terceiro);
					break;
					
				case 2:	
					System.out.println("Ordem \033[1;31mDECRESENTE\033[0m");
					System.out.println("teceiro valor: "+terceiro);
					System.out.println("Segundo valor: "+segundo);
					System.out.println("Primeiro valor: "+primeiro);
					break;
					
				default:
					System.out.println(" \033[1;31mCODIGO INVALIDO\033[0m");
					
					
			}
			
			
				
	
			//System.out.print("\033[0;32m");
			//System.out.printf("Salario inicial: R$%.2f",0);
			//System.out.printf("\nAumento de: R$%.2f",0);
	
			

 
	 
		}
	}
/*
(12) Escreva um algoritmo para ler um conjunto de quatro valores I, A, B, C, 
onde I é um valor inteiro e positivo
 e A, B, C, são quaisquer valores reais.
  A seguir: 

    a) Se I = 1 escrever os três valores A, B, C em ordem crescente.
    
    b) Se I = 2 escrever os três valores A, B, C em ordem decrescente.

 */
 
