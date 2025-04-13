package lista_02;

	
import java.util.Scanner;

public class Exercicio01
{
	public static void main(String[] args) {
	
	   
	    Scanner leitor = new Scanner(System.in);
	    
		System.out.println("\033[1;36m-- Exercicio 01 lista 02--\033[0m");
		
	    System.out.print("informe o primeiro valor ");
	    float valor01 = leitor.nextFloat();
	    
	    System.out.print("informe o segundo valor ");
	    float valor02 = leitor.nextFloat();
	    
	    leitor.close();
	    
	    
		System.out.println("\033[1;32m-- RESULTADO--\033[0m");		
		
	    
	    if(valor01 % valor02 == 0 || valor02 % valor01 == 0) {
	    	
	    	System.out.println("Os valores sao multiplos entre si ");
	    }else {
	    	System.out.println("Os valores nao sao multiplos entre si ");
	    }
	   
	    
	    
	    
	}
}

/*

x(01) Escreva um algoritmo para ler 2 valores A e B 
e escrever seus valores seguidos da mensagem: "são múltiplos entre si" ou "não são múltiplos entre si".

 */