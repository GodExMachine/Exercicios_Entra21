package lista_02;
import java.util.Scanner;

public class Exercicio14 {

		public static void main(String[] args) {
				    
		    Scanner leitor = new Scanner(System.in);	
		    	
			System.out.println("\033[1;36m-- Exercicio 14 lista 02--\033[0m");
		    
			System.out.print("Informe a primeira nota: ");
			float nota01  = leitor.nextFloat();
		
			System.out.print("Informe a segunda nota: ");
			float nota02  = leitor.nextFloat();
			
			System.out.print("Informe a terceira nota: ");
			float nota03  = leitor.nextFloat();
			
			System.out.print("Informe a media dos exercicios: ");
			float mediaEx  = leitor.nextFloat();
			
				  		
			leitor.close();
			
			float mediaAp = (nota01 + (nota02 * 2) + (nota03 * 3) + mediaEx  ) / 7;
			
			String resultado = mediaAp >= 6 ? "\033[1;36mAPROVADO":"\033[1;31mREPROVADO";
			
			String conceito = "A";

			if(mediaAp >= 9) {
				conceito = "A";
			}else{
				if(mediaAp <= 8.9 && mediaAp >= 7.5) {
					conceito = "B";
				}
				
				if(mediaAp <= 7.4 && mediaAp >= 6) {
					conceito = "C";
				}
				
				if(mediaAp <= 5.9 && mediaAp >= 4) {
					conceito = "D";
				}
				
				if(mediaAp <= 3.9 ) {
					conceito = "E";
				}
							
			}
			
			 
			System.out.println("\033[1;32m-- RESULTADO--\033[0m");
			
			System.out.printf("Notas %.1f",nota01);
			System.out.printf("  %.1f",nota02);
			System.out.printf("  %.1f",nota03);
			System.out.printf("\nMedia dos Exercicios %.1f",mediaEx);
			System.out.printf("\nMedia de aproveitamento %.1f",mediaAp);
			System.out.println("\nConceito: "+conceito);
			System.out.println(resultado);
			
			
			//System.out.printf("\nAumento de: R$%.2f",(novoSalario-salarioInicial));
			//System.out.printf("\nNovo salario: R$%.2f",novoSalario);
			
	 
		
	}
}
/*
 (14) Escreva um algoritmo para ler o número de identificação, 
 as três notas obtidas por um aluno e a média dos exercícios que fazem parte da avaliação.
  Calcular a média de aproveitamento, usando a fórmula:
inicio
    MA = (Nota1 + Nota2 x 2 + Nota3 x 3 + ME ) / 7


A atribuição de conceitos obedece a tabela abaixo:

	MA		Conceito
	
	9,0		A
	
	7,5 e < 8,9 	B
	
	6,0 e < 7,4 	C
	
	4,0 e < 5,9 	D
	
	< 3,9	 	E

O algoritmo deve escrever o número do aluno, 
 suas notas,
 a média dos exercícios,
  a média de aproveitamento, 
  o conceito correspondente e 
  
  a mensagem: APROVADO se o conceito for A, B ou C 
  	e REPROVADO se o conceito for D ou E.

 */
 
