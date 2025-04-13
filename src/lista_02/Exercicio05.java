package lista_02;

	
import java.util.Scanner;

public class Exercicio05
{
	public static void main(String[] args) {
	   
	    Scanner leitor = new Scanner(System.in);
	    
		System.out.println("\033[1;36m-- Exercicio 05 lista 02--\033[0m");
	    
	    System.out.print("Informe o primeiro valor. ");
	    int valorA = leitor.nextInt();
	    
	    System.out.print("Informe o segundo valor. ");
	    int valorB = leitor.nextInt();
	    
	    System.out.print("Informe o terceiro valor. ");
	    int valorC = leitor.nextInt();
	    
	    leitor.close();
	    

		System.out.println("\033[1;32m-- RESULTADO--\033[0m");
		    
	    
	    if(valorA > valorB + valorC || valorB > valorA + valorC || valorC > valorA + valorB ) {
	    	System.out.println("Não é um triangulo.");
	    }else {
	    	System.out.println("é um triangulo.");
	    }
	    	
	   
	
	   
	   
	   
	   
	}
}


/*
(05) Escreva um algoritmo para ler três valores A, B, C 
e verificar se eles formam ou não um triângulo (se a > b + c não formam triângulo algum).



 */