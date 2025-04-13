package lista_03;
import java.util.Scanner;

public class Exercicio06 {

	
	public static void main(String args[]) {
		
		System.out.println("\033[1;36m-- Lista 03 Exerciocio 06-\033[0m");
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe o valor para calculo fatorial: ");
		int valor = leitor.nextInt();
		
		leitor.close();
			
		valor--;
		
		int resultado = 1;
		
		for(int i = 0 ; i < valor ; valor-- ) {
			
			resultado +=  (resultado * valor);

		}
		 
		System.out.println("\033[1;32m-- RESULTADO--\033[0m");
		
		System.out.print("Resultado: "+resultado);
		
		
	
	}
}

//(06) Escreva um algoritmo para ler um número inteiro e positivo e calcular o seu fatorial.