package lista_03;
import java.util.Scanner;

public class Exercicio17 {
	
	public static void main(String args[]) {
		
		System.out.println("\033[1;36m-- Lista 03 Exerciocio 17 --\033[0m");
		
		Scanner leitor = new Scanner(System.in);
		
		
		
		System.out.print("\nInforme para verificar sua tabuada: ");
		int valorEntrada = leitor.nextInt();
		
		leitor.close();
		
		System.out.println("\n"+"\033[1;32m-- RESULTADO --\033[0m");

		
		
		for(int i = 1; i < (valorEntrada + 1); i++) {
			
		int resultado = i * valorEntrada;	
			
		System.out.println(i+" x "+valorEntrada+" = "+resultado);
			
		}
		
		

		
		
		System.out.println("\n"+"\033[41m-- SISTEMA ENCERRADO --\033[0m");
		
		
	}
	
}

/*
  
(17) Escreva um algoritmo para 
ler um valor para uma variável n 
e calcular a tabuada de 1 até n.
 Escreva a tabuada na forma:

	1 x n = n

	2 x n = 2n

	3 x n = 3n

	...

	n x n = n2
	

 */
