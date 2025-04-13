package lista_02;

	
import java.util.Scanner;

public class Exercicio02
{
	public static void main(String[] args) {
	
	   
	    Scanner leitor = new Scanner(System.in);
	    	
		System.out.println("\033[1;36m-- Exercicio 02 lista 02--\033[0m");
	    
	    System.out.print("informe o primeiro valor ");
	    int valor01 = leitor.nextInt();
	    
	    System.out.print("informe o segundo valor ");
	    int valor02 = leitor.nextInt();
	    
	    System.out.print("informe o terceiro valor ");
	    int valor03 = leitor.nextInt();
	    
	    leitor.close();
	    
		System.out.println("\033[1;32m-- RESULTADO--\033[0m");
	    

	    if(valor01 > valor02 && valor01 > valor03) {
	    		System.out.print("o primeiro valor é o maior");
	    }
	    

	    if(valor02 > valor01 && valor02 > valor03) {
	    		System.out.print("o segundo valor é o maior");
	    }

	    if(valor03 > valor01 && valor03 > valor02) {
	    		System.out.print("o terceiro valor é o maior");
	    }
	    
	    
	}
}

/*
(02) Escreva um algoritmo para ler 3 números inteiros e mostrar o maior deles.



 */