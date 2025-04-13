package lista_03;
import java.util.Scanner;

public class Exercicio07 {

	
	public static void main(String args[]) {
		
		System.out.println("\033[1;36m-- Lista 03 Exerciocio 07-\033[0m");
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe o valor para verificar: ");
		int valorEntrada = leitor.nextInt();
		
		System.out.print("Informe o resultado do fatorial:  ");
		int valorTeste = leitor.nextInt();
		
		leitor.close();
			
		int guardaEntrada = valorEntrada;
				
		valorEntrada--;
		
		
		int resultado = 1;
		
		for(int i = 0 ; i < valorEntrada ; valorEntrada-- ) {
			
			resultado +=  (resultado * valorEntrada);
		

		}
		
		System.out.println("\033[1;32m-- RESULTADO--\033[0m");
		
		if(resultado == valorTeste) {
			System.out.println(valorTeste+" é fatorial de "+guardaEntrada);				
		}else {
			System.out.println(valorTeste+" não é fatorial de "+guardaEntrada);					
		}
		
		 
		
		
	
	}
}

//(07) Escreva um algoritmo para ler dois números inteiros e positivos e informar se o segundo corresponde ao fatorial do primeiro.

