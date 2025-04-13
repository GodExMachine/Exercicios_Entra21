package lista_03;
import java.util.Scanner;

public class Exercicio16 {
	
	public static void main(String args[]) {
		
		System.out.println("\033[1;36m-- Lista 03 Exerciocio 16 --\033[0m");
		
		Scanner leitor = new Scanner(System.in);
		
		int soma = 0;	
		
		System.out.print("\nInforme o numero inicial: ");
		int numeroInicial = leitor.nextInt(); //a1	
		
		System.out.print("Informe o valor da progressão: ");
		int progressao = leitor.nextInt(); //r
		
		System.out.print("Informe a quantidade de termos: ");
		int tamanho = leitor.nextInt(); //n
		
		leitor.close();
		
		System.out.println("\n"+"\033[1;32m-- RESULTADO --\033[0m");
			
		for(int i = 0; i< tamanho; i++) {
			System.out.println(i+1+"º termo: "+numeroInicial);
			soma += numeroInicial;
			numeroInicial += progressao;
			
			
		}
		
		System.out.println("A soma dos termos é: "+soma);
		
		System.out.println("\n"+"\033[41m-- SISTEMA ENCERRADO --\033[0m");
		
		
	}
	
}

/*
  
 n  numeros de termos significa quantos numeros
 a1 é o primeiro numero
 r  pe quanto ele aumenta em relçaao ao anterior
  
  (16) Escreva um algoritmo para ler 
  um número n (número de termos de uma progressão aritmética),
  a1 (o primeiro termo da progressão) e 
  r (a razão da progressão) 
  
  e escrever os n termos desta progressão,
  bem como a soma dos elementos.

 */
