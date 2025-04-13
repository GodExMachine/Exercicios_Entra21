package lista_03;
import java.util.Scanner;

public class Exercicio09_v2 {

	public static void main (String args[]) {

		System.out.println("\033[1;36m-- Lista 03 Exerciocio 09 v.2 --\033[0m");
		
		Scanner leitor = new Scanner(System.in);
		
		
		System.out.print("\nInforme o valor: ");
		int valorEntrada = leitor.nextInt();
		leitor.close();
		
		float resultado = 0;
				
		for(int i = 1; i <= valorEntrada; i++) {
		
			int fatorial = 1;
			
			for(int j = 1; j <= i; j++) {
				
				fatorial += fatorial * j;
				
			}
			
		resultado += 1.0f / fatorial;  		

		
		}	
		
		//fatorial de 1 é 1 entao nao precisa calcular
		resultado++;
		
		//a formula do professor pede para adicionar + 1
		resultado++;
		
		
		System.out.println("\n"+"\033[1;32m-- RESULTADO--\033[0m");
		System.out.printf("\nO valor de 'E' é %.4f",resultado);
		
		
		
		
		//System.out.print("\nFatorial de "+valorEntrada+" é: "+fatorial);
		//System.out.printf("\n%.4f",resultado);	
				
				
		
	}
	
}

//
//(09) Escreva um algoritmo para ler um um valor N inteiro e positivo e calcular o valor de E:  
//
//	E = 1 + 1 / 1! + 1 / 2! + 1 / 3! + ... + 1 / N!
    
