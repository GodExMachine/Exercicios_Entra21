package lista_02;

	
import java.util.Scanner;

public class Exercicio03
{
	public static void main(String[] args) {
	
	   
	    Scanner leitor = new Scanner(System.in);
	    
		System.out.println("\033[1;36m-- Exercicio 03 lista 02--\033[0m");
	    
	    System.out.print("informe o primeiro valor ");
	    int numero = leitor.nextInt();
	    
	    leitor.close();
	    
	    boolean testePar = numero % 2 == 0;
	    boolean testeNegativo = numero < 0;
	    
	    
		System.out.println("\033[1;32m-- RESULTADO--\033[0m");
		
		
	    if(testePar == true && testeNegativo == false) {
	    	System.out.println("O numero informado é par e positivo");
	    }
	    
	    if(testePar == false && testeNegativo == true) {
	    	System.out.println("O numero informado nao é par e negativo");
	    }
	    
	    if(testePar == false && testeNegativo == false) {
	    	System.out.println("O numero informado nao é par e positivo");
	    }
	    
	    if(testePar == true && testeNegativo == true) {
	    	System.out.println("O numero informado é par e negativo");
	    }
	    
	    
	    
	}
}


/*

(03) Escreva um algoritmo para ler um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar,
 e se é positivo ou negativo.

 */