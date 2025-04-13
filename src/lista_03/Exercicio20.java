package lista_03;
import java.util.Scanner;

public class Exercicio20 {

	
	public static void main(String args[]) {
	    
	    Scanner leitor = new Scanner(System.in);
	    
		System.out.println("\033[1;36m-- Lista 03 Exerciocio 20-\033[0m");
		
		System.out.print("Informe um valor inteiro e positivo: ");
		int valorEntrada = leitor.nextInt();
		
		float resultado = 1.0f;
		
		float conta = 0.0f;
		
		leitor.close();
		
		System.out.println("\033[1;32m-- RESULTADO--\033[0m");
		
		
		
		for(int i = 1; i <= valorEntrada ; i++){
		   
		    conta = 1.0f / i;
		    
		    resultado += conta;
		    
		    System.out.print(" 1 / "+i+" = ");
		    
		    System.out.printf(" %.2f",conta);
		    
		    System.out.println("");
		    
		}
	    	

        
        System.out.printf("resultado %.2f",resultado);
      
	  	System.out.println("\n"+"\033[41m-- SISTEMA ENCERRADO --\033[0m");
	}
}


//(20) Escreva um algoritmo para ler um valor n inteiro e positivo e calcular a seguinte soma:  

//	S = 1 + 1/2 + 1/3 + 1/4 + ... + 1/n

//O algoritmo deve escrever cada termo gerado e o valor final de S.

//o algoritmo deve somar 1 com 1 dividido por 2, depois somar 1 dividido por 3, depois 1 dividido por 4, e assim por diante até
//ou seja 1/i 2/i até o numero informado e exibe cada divisao medida que vai calculando.o número informado pelo usuario
//manter  uma variável que vai armazenando o total da soma até o momento, começando com 1 e indo somando os valores das frações 
//conforme i aumenta.