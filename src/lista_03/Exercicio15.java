package lista_03;
import java.util.Scanner;

public class Exercicio15 {
	
	public static void main(String args[]) {
		
		System.out.println("\033[1;36m-- Lista 03 Exerciocio 15 --\033[0m");
		
		Scanner leitor = new Scanner(System.in);
		
		while(true){
			
			float mediaPonderada = 0.0f;
					
			System.out.print("\nInforme o codigo do aluno: ");
			int codigoAluno = leitor.nextInt();
			
			if(codigoAluno < 0) {
				break;
			}
			
			System.out.print("Informe a 1º nota: ");
			float nota01 = leitor.nextFloat();
	
			System.out.print("Informe a 2º nota: ");
			float nota02 = leitor.nextFloat();
			
			System.out.print("Informe a 3º nota: ");
			float nota03 = leitor.nextFloat();
								
			if(nota01 >= nota02 && nota01 >= nota03) {
				mediaPonderada = ((nota01 * 4)+(nota02 * 3)+(nota03 * 3))/11;
				
			}else if(nota02 >= nota01 && nota02 >= nota03) {
				mediaPonderada = ((nota01 * 3)+(nota02 * 4)+(nota03 * 3))/11;
					
			}else{
				mediaPonderada = ((nota01 * 3)+(nota02 * 3)+(nota03 * 4))/11;
			}		
		
			System.out.println("\n"+"\033[1;32m-- RESULTADO --\033[0m");
			System.out.println("Codigo do aluno: "+codigoAluno );
			System.out.println("Notas: "+nota01+" | "+nota02+" | "+nota03);
			System.out.printf("Media Ponderada: %.1f",mediaPonderada);
			System.out.println("\nSituação: "+(mediaPonderada >= 5 ? "\033[1;36mAprovado\033[0m":"\033[1;31mReprovado\033[0m"));
		
		}	
		
		System.out.println("\n"+"\033[41m-- SISTEMA ENCERRADO --\033[0m");
		
		leitor.close();
		
	}
	
}

/*
(15) Escreva um algoritmo para 
ler o código de um aluno e
suas três notas. 
Calcule a média ponderada do aluno,
considerando que o peso para a maior nota seja 4 
e para as duas restantes, 3.
  
  Mostre o código do aluno,
  suas três notas, 
  a média calculada 
  e uma mensagem "APROVADO" se a média for maior ou igual a 5 e
  "REPROVADO" se a média for menor que 5. 
      
   Repita a operação até que o código lido seja negativo.

 
 */
