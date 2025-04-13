package lista_02;

	
import java.util.Scanner;

public class Exercicio06
{
	public static void main(String[] args) {
	
	   
	    Scanner leitor = new Scanner(System.in);
	     
		System.out.println("\033[1;36m-- Exercicio 06 lista 02--\033[0m");
		
	    System.out.print("Informe o primeiro valor. ");
	    int valorA = leitor.nextInt();
	    
	    System.out.print("Informe o segundo valor. ");
	    int valorB = leitor.nextInt();
	    
	    System.out.print("Informe o terceiro valor. ");
	    int valorC = leitor.nextInt();
	    
	    leitor.close();
	    
		System.out.println("\033[1;32m-- RESULTADO--\033[0m");
		
 	    if(valorA == valorB && valorA == valorC) {
		   System.out.print("esté é um triangulo equilatero ");
		   
	    }else {	    	
		    if(valorA == valorB || valorA == valorC || valorB == valorC) {
			   System.out.print("esté é um triangulo isosilis ");
			   
		    } 
	    }
	   
	    if(valorA != valorB && valorA != valorC) {
		   System.out.print("esté é um triangulo escaleno ");
	    }
	   
	   
	}
}

/*

(06) Escreva um algoritmo para ler as medidas dos lados de um triângulo e escrever se ele é Equilátero, Isósceles ou Escaleno. Sendo que:

	x−Triângulo Equilátero: possui os 3 lados iguais;
	
	x−Triângulo Isósceles: possui 2 lados iguais;
	
	x−Triângulo Escaleno: possui 3 lados diferentes.

 */